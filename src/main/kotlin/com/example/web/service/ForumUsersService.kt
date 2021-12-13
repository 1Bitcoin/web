package com.example.web.service

import com.example.web.model.entity.ForumUsersEntity
import com.example.web.repository.ForumUsersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ForumUsersService @Autowired constructor(val forumUsersRepository: ForumUsersRepository,
                                               val userService: UserService, val forumService: ForumService
) {

    fun save(userName: String, forumSlug: String) {
        val userID = userService.getUserByNickname(userName).id
        val forumID = forumService.getForumBySlug(forumSlug).id

        if (isUserInForumExists(userID, forumID)) {
            forumUsersRepository.save(ForumUsersEntity(user_id = userID, forum_id = forumID))
        }
    }

    fun isUserInForumExists(userID: Int, forumID: Int): Boolean {
        return forumUsersRepository.isUserInForumExists(userID, forumID) == 0
    }
}
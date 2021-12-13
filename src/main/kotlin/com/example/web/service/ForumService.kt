package com.example.web.service

import com.example.web.exception.ForumAlreadyCreatedException
import com.example.web.exception.ForumNotFoundException
import com.example.web.model.entity.ForumsEntity
import com.example.web.repository.ForumsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ForumService (val forumRepository: ForumsRepository,
                    val userService: UserService) {

    fun getForumBySlug(slug: String): ForumsEntity {
        return forumRepository.getForumBySlug(slug) ?: throw ForumNotFoundException("Can't find forum by slug")
    }

    fun create(forum: ForumsEntity) {
        checkForumExists(forum.slug)

        if (userService.isUserWithNicknameExists(forum.user_nickname))
            forumRepository.save(forum)
    }

    private fun checkForumExists(forumName: String) {
        val existedForum = forumRepository.getForumBySlug(forumName)

        if (existedForum != null)
             throw ForumAlreadyCreatedException(existedForum)
    }

    fun isForumExists(slug: String): Boolean {
        if (forumRepository.getCountForum(slug) != 0)
            return true
        else
            throw ForumNotFoundException("Can't find forum")
    }
}


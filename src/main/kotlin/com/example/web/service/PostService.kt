package com.example.web.service

import com.example.web.model.entity.PostsEntity
import com.example.web.repository.PostsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PostService @Autowired constructor(val postRepository: PostsRepository, val threadService: ThreadsService,
                                         val userService: UserService, val forumUserService: ForumUsersService
) {

    fun createPost(post: PostsEntity) {
        if (userService.isUserWithNicknameExists(post.author) && threadService.isThreadExists(post.thread)) {
            post.forum = threadService.getThreadById(post.thread).forum

            forumUserService.save(post.author, post.forum)
            postRepository.save(post)
        }
    }
}
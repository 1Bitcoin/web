package com.example.web.service

import com.example.web.exception.ThreadAlreadyCreatedException
import com.example.web.exception.ThreadNotFoundException
import com.example.web.model.entity.ThreadsEntity
import com.example.web.repository.ThreadsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ThreadsService @Autowired constructor(val threadRepository: ThreadsRepository,
                                            val userService: UserService, val forumService: ForumService,
                                            val forumUserService: ForumUsersService
) {

    fun checkThreadExists(slug: String) {
        val existedThread = threadRepository.getThreadBySlug(slug)

        if (existedThread != null)
            throw ThreadAlreadyCreatedException(existedThread)
    }

    fun isThreadExists(id: Int): Boolean {
        if (threadRepository.isThreadExistsById(id) != 0) {
            return true

        } else {
            throw ThreadNotFoundException("Can't find thread by id")
        }
    }

    fun getThreadById(id: Int): ThreadsEntity {
        return threadRepository.getThreadById(id) ?: throw ThreadNotFoundException("Can't find thread by id")
    }

    fun createThread(thread: ThreadsEntity) {
        userService.isUserWithNicknameExists(thread.author)
        forumService.isForumExists(thread.forum)

        checkThreadExists(thread.slug)

        forumUserService.save(thread.author, thread.forum)
        threadRepository.save(thread)
    }
}
package com.example.web.controller

import com.example.web.model.entity.ThreadsEntity
import com.example.web.service.ThreadsService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@Service
@RequestMapping("/api/v1/thread")
class ThreadResource(val threadService: ThreadsService) {

    @PostMapping("/{slugForum}/create")
    fun createThread(@RequestBody thread: ThreadsEntity, @PathVariable slugForum: String): ResponseEntity<ThreadsEntity>{
        thread.forum = slugForum
        threadService.createThread(thread)

        return ResponseEntity(thread, HttpStatus.CREATED)
    }
}
package com.example.web.controller

import com.example.web.model.entity.ForumsEntity
import com.example.web.service.ForumService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/v1/forum")
class ForumResource(val forumService: ForumService){

    @PostMapping("/create")
    fun create(@RequestBody forum: ForumsEntity): ResponseEntity<ForumsEntity>{
        forumService.create(forum)

        return ResponseEntity(forum, HttpStatus.CREATED)
    }

    @GetMapping("/{slug}/details")
    fun getForumInfo(@PathVariable slug: String): ResponseEntity<ForumsEntity>{
        val forum = forumService.getForumBySlug(slug)

        return ResponseEntity(forum, HttpStatus.OK)
    }
}
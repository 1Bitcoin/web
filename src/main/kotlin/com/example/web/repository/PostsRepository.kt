package com.example.web.repository

import com.example.web.model.entity.PostsEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PostsRepository : CrudRepository<PostsEntity, Int> {
}
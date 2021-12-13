package com.example.web.model.entity

import javax.persistence.Id
import javax.persistence.Table
import java.sql.Timestamp
import java.time.Instant

@Table(name = "posts")
data class PostsEntity(
    var path: MutableList<Int>? = null,
    @Id var id: Int? = null,
    var parent: Int,
    var author: String,
    var forum: String = "default",
    var created: Timestamp = Timestamp.from(Instant.now()),
    var message: String,
    var thread: Int
)
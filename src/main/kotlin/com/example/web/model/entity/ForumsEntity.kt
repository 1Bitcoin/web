package com.example.web.model.entity

import javax.persistence.Id
import javax.persistence.Table

@Table(name = "forums")
data class ForumsEntity(
    var user_nickname: String,
    var title: String,
    var slug: String,
    var posts: Int,
    var threads: Int,
    @Id var id: Int
    )
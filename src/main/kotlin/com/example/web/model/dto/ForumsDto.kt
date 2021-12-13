package com.example.web.model.dto


data class ForumsDto(
    var user_nickname: String,
    var title: String,
    var slug: String,
    var posts: Int,
    var threads: Int,
    var id: Int
)
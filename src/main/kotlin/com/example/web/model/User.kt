package com.example.web.model

data class User(
    var fullname: String,
    var email: String,
    var nickname: String? = null,
    var about: String,
    var id: Int
)
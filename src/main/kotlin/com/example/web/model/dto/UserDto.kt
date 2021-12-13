package com.example.web.model.dto

data class UserDto(
    var fullname: String,
    var email: String,
    var nickname: String? = null,
    var about: String,
    var id: Int
    )
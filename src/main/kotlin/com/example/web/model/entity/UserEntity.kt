package com.example.web.model.entity

import javax.persistence.Id
import javax.persistence.Table

@Table(name = "users")
data class UserEntity(
    var fullname: String,
    var email: String,
    var nickname: String? = null,
    var about: String,
    @Id var id: Int)

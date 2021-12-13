package com.example.web.model.entity

import javax.persistence.Table

@Table(name = "status")
data class StatusEntity(
    val threads: Int,
    val posts: Int,
    val forums: Int,
    val users: Int
    )
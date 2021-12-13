package com.example.web.model.entity

import javax.persistence.Id
import javax.persistence.Table

@Table(name = "thread_votes")
data class ThreadVotesEntity(
    val voice: Int,
    val user_id: Int,
    val threads_id: Int,
    val id: Int
    )
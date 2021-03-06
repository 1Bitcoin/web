package com.example.web.model.entity

import javax.persistence.Id
import javax.persistence.Table
import java.sql.Timestamp
import java.time.Instant

@Table(name = "threads")
data class ThreadsEntity(
    @Id var id: Int? = null,
    var forum: String = "default",
    var title: String,
    var votes: Int,
    var message: String,
    var slug: String,
    var created: Timestamp = Timestamp.from(Instant.now()),
    var author: String
    )
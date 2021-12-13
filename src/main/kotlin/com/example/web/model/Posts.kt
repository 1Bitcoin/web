package com.example.web.model

import java.sql.Timestamp
import java.time.Instant

data class Posts(
    var path: MutableList<Int>? = null,
    var id: Int? = null,
    var parent: Int,
    var author: String,
    var forum: String = "default",
    var created: Timestamp,
    var message: String,
    var thread: Int
)
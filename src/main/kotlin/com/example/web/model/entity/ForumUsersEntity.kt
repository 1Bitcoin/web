package com.example.web.model.entity


import javax.persistence.Id
import javax.persistence.Table

@Table(name = "forum_users")
data class ForumUsersEntity(
    @Id var id: Int? = null,
    var user_id: Int,
    var forum_id: Int)
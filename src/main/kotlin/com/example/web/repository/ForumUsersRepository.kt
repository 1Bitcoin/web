package com.example.web.repository

import com.example.web.model.entity.ForumUsersEntity
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface ForumUsersRepository : CrudRepository<ForumUsersEntity, Int> {

    @Query("select COUNT(*) from forum_users where user_id = :user_id and forum_id = :forum_id", nativeQuery = true)
    fun isUserInForumExists(@Param("user_id") user_id: Int, @Param("forum_id") forum_id: Int): Int
}

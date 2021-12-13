package com.example.web.repository

import com.example.web.model.entity.ThreadsEntity
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface ThreadsRepository : CrudRepository<ThreadsEntity, Int> {
    @Query("select * from threads where slug = :slug", nativeQuery = true)
    fun getThreadBySlug(@Param("slug") slug: String): ThreadsEntity?

    @Query("select COUNT(*) from threads where id = :id", nativeQuery = true)
    fun isThreadExistsById(@Param("id") id: Int): Int

    @Query("select * from threads where id = :id", nativeQuery = true)
    fun getThreadById(@Param("id") id: Int): ThreadsEntity?
}
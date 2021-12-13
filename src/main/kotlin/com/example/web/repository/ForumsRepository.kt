package com.example.web.repository

import com.example.web.model.entity.ForumsEntity
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface ForumsRepository : CrudRepository<ForumsEntity, Int> {

    @Query(" select * from forums where slug = :slug", nativeQuery = true)
    fun getForumBySlug(@Param("slug") slug: String): ForumsEntity?

    @Query("select COUNT(*) from forums where slug = :slug", nativeQuery = true)
    fun getCountForum(@Param("slug") slug: String): Int
}
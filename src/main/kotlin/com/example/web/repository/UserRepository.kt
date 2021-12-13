package com.example.web.repository

import com.example.web.model.entity.UserEntity
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : CrudRepository<UserEntity, Int> {
    @Query(value = "select * from users", nativeQuery = true)
    fun selectAll(): List<UserEntity>

    @Query("select * from users where nickname = :nickname", nativeQuery = true)
    fun getUserByNickname(@Param("nickname") nickname: String): UserEntity?

    @Query("select COUNT(*) from users where email = :email", nativeQuery = true)
    fun isUserWithEmailExists(@Param("email") email: String): Int

    @Query("select COUNT(*) from users where nickname = :nickname", nativeQuery = true)
    fun getCountUsersByNickname(@Param("nickname") nickname: String): Int

    @Query("select * from users where email = :email", nativeQuery = true)
    fun getUserByEmail(@Param("email") email: String): UserEntity?
}



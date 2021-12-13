package com.example.web.model.mapper

import com.example.web.model.ForumUsers
import com.example.web.model.dto.ForumUsersDto
import com.example.web.model.entity.ForumUsersEntity
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface ForumUsersMapper {
    fun convertEntityToModel(forumUsersEntity: ForumUsersEntity) : ForumUsers

    fun convertModelToEntity(forumUsers: ForumUsers) : ForumUsersEntity

    fun convertModelToDto(forumUsers: ForumUsers) : ForumUsersDto

    fun convertDtoToModel(forumUsersDto: ForumUsersDto) : ForumUsers
}
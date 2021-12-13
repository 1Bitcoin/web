package com.example.web.model.mapper

import com.example.web.model.User
import com.example.web.model.dto.UserDto
import com.example.web.model.entity.UserEntity
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface UserMapper {
    fun convertEntityToModel(userEntity: UserEntity) : User

    fun convertModelToEntity(user: User) : UserEntity

    fun convertModelToDto(user: User) : UserDto

    fun convertDtoToModel(userDto: UserDto) : User
}
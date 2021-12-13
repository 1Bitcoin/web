package com.example.web.model.mapper

import com.example.web.model.Posts
import com.example.web.model.dto.PostsDto
import com.example.web.model.entity.PostsEntity
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper(componentModel = "spring")
interface PostsMapper {

    //@Mapping(target = "clientFrom", source = "from")
    fun convertEntityToModel(postsEntity: PostsEntity) : Posts

    fun convertModelToEntity(posts: Posts) : PostsEntity

    fun convertModelToDto(posts: Posts) : PostsDto

    fun convertDtoToModel(postsDto: PostsDto) : Posts
}
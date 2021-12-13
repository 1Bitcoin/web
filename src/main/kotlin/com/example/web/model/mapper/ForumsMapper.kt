package com.example.web.model.mapper

import com.example.web.model.Forums
import com.example.web.model.dto.ForumsDto
import com.example.web.model.entity.ForumsEntity
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface ForumsMapper {
    fun convertEntityToModel(forumsEntity: ForumsEntity) : Forums

    fun convertModelToEntity(forums: Forums) : ForumsEntity

    fun convertModelToDto(forums: Forums) : ForumsDto

    fun convertDtoToModel(forumsDto: ForumsDto) : Forums
}
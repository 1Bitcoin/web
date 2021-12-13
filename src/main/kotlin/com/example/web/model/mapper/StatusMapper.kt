package com.example.web.model.mapper

import com.example.web.model.Status
import com.example.web.model.dto.StatusDto
import com.example.web.model.entity.StatusEntity
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface StatusMapper {
    fun convertEntityToModel(statusEntity: StatusEntity) : Status

    fun convertModelToEntity(status: Status) : StatusEntity

    fun convertModelToDto(status: Status) : StatusDto

    fun convertDtoToModel(statusDto: StatusDto) : Status
}
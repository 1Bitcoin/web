package com.example.web.model.mapper

import com.example.web.model.Threads
import com.example.web.model.dto.ThreadsDto
import com.example.web.model.entity.ThreadsEntity
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface ThreadsMapper {
    fun convertEntityToModel(threadsEntity: ThreadsEntity) : Threads

    fun convertModelToEntity(threads: Threads) : ThreadsEntity

    fun convertModelToDto(threads: Threads) : ThreadsDto

    fun convertDtoToModel(threadsDto: ThreadsDto) : Threads
}
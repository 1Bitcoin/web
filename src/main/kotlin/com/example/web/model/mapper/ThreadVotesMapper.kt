package com.example.web.model.mapper


import com.example.web.model.ThreadVotes
import com.example.web.model.dto.ThreadVotesDto
import com.example.web.model.entity.ThreadVotesEntity
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface ThreadVotesMapper {
    fun convertEntityToModel(threadVotesEntity: ThreadVotesEntity) : ThreadVotes

    fun convertModelToEntity(threadVotes: ThreadVotes) : ThreadVotesEntity

    fun convertModelToDto(threadVotes: ThreadVotes) : ThreadVotesDto

    fun convertDtoToModel(threadVotesDto: ThreadVotesDto) : ThreadVotes
}
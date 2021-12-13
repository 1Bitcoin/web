package com.example.web.repository

import com.example.web.model.entity.ThreadVotesEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ThreadVotesRepository : CrudRepository<ThreadVotesEntity, Int> {
}
package com.example.web.repository

import com.example.web.model.entity.StatusEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface StatusRepository : CrudRepository<StatusEntity, Int> {
}
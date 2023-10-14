package com.interno.apicontatos.repository

import com.interno.apicontatos.entity.ContatoEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ContatoRepository : JpaRepository<ContatoEntity, Long>
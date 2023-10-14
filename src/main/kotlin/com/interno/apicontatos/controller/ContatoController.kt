package com.interno.apicontatos.controller

import com.interno.apicontatos.entity.ContatoEntity
import com.interno.apicontatos.repository.ContatoRepository
import jakarta.persistence.EntityNotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/contatos")
class ContatoController {
    @Autowired
    lateinit var contactRepository: ContatoRepository


    @GetMapping
    fun getAllContacts(): List<ContatoEntity> {
        return contactRepository.findAll()
    }

    @PostMapping
    fun createContact(@RequestBody contact: ContatoEntity): ContatoEntity {
        return contactRepository.save(contact)
    }



    @GetMapping("/{id}")
    fun getContactById(@PathVariable id: Long): ContatoEntity {
        return contactRepository.findById(id).orElseThrow { EntityNotFoundException("Contact not found") }
    }

    @DeleteMapping("/{id}")
    fun deleteContact(@PathVariable id: Long) {
        contactRepository.deleteById(id)
    }

    @PutMapping("/{id}")
    fun updateContact(@PathVariable id: Long, @RequestBody updatedContact: ContatoEntity): ContatoEntity {
        val existingContact = contactRepository.findById(id)
            .orElseThrow { EntityNotFoundException("Contact not found") }
        existingContact.nome = updatedContact.nome
        existingContact.email = updatedContact.email
        existingContact.numeroTelefone = updatedContact.numeroTelefone
        return contactRepository.save(existingContact)
    }
}
package com.interno.apicontatos.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import org.intellij.lang.annotations.JdkConstants.InputEventMask

@Entity
data class ContatoEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    @field:NotBlank(message = "O nome é obrigatório.")
    var nome: String,
    @field:Email(message = "O e-mail deve possuir um formato válido.")
    @NotBlank(message = " Email é obrigatório.")
    var email: String,
    var numeroTelefone: String,
    @field:Pattern(
        regexp = "\\d{9}",
        message = "Dados invalidos, favor validar."
    )
    @NotBlank(message = " Você precisa adicionar um Cpf")
    var cpf: String
)
package br.com.alura.forum.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class AtualizarTopicoForm (
    @field:NotNull val id: Long,
    @field:NotEmpty @field:Size(min = 5) val titulo: String,
    @field:NotEmpty val mensagem: String
        )
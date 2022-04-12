package br.com.farolshopping.forum.controller.dto

data class NovoTopicoDto(
        val titulo: String,
        val mensagem: String,
        val idCurso: Long,
        val idAutor: Long
)

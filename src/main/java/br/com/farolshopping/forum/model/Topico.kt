package br.com.farolshopping.forum.model

import org.springframework.web.bind.annotation.ResponseStatus
import java.time.LocalDateTime

data class Topico (
    val id: Long? = null,
    val titulo: String,
    val mensagem: String,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
    val curso: Curso,
    val autor: Usuario,
    val status: StatusTopico = StatusTopico.NAO_RESPONDIDO,
    val respostas: List<Resposta> = ArrayList()
    )

package br.com.farolshopping.forum.service

import br.com.farolshopping.forum.controller.dto.NovoTopicoDto
import br.com.farolshopping.forum.model.Topico
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TopicoService(
        private var topicos: List<Topico>,

        @Autowired
        private val cursoService: CursoService,
        @Autowired
        private val usuarioService: UsuarioService
        ){

    init {
        this.topicos = ArrayList();
    }

    fun listar(): List<Topico> {
        return topicos
    }

    fun buscarPorId(id: Long): Topico {
        return topicos.stream().filter {
            t -> t.id == id
        }.findFirst().get()
    }

    fun cadastrar(dto: NovoTopicoDto) {
        topicos = topicos.plus(Topico(
                id = topicos.size.toLong() + 1,
                titulo = dto.titulo,
                mensagem = dto.mensagem,
                curso = cursoService.buscarPorId(dto.idCurso),
                autor = usuarioService.buscarPorId(dto.idAutor)
        ))
    }


}
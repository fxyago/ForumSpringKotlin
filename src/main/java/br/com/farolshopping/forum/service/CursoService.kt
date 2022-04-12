package br.com.farolshopping.forum.service

import br.com.farolshopping.forum.model.Curso
import org.springframework.stereotype.Service
import java.util.*
import java.util.stream.Collectors

@Service
class CursoService(private var cursos: List<Curso>) {

    init {
        val curso = Curso(
                id = 1,
                nome = "Kotlin",
                categoria = "Programação"
        )
        cursos = Arrays.asList(curso)
    }

    fun buscarPorId(id: Long): Curso {
        return cursos.stream().filter {
            c -> c.id == id
        }.findFirst().get()
    }
}

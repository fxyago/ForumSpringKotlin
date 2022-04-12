package br.com.farolshopping.forum.service

import br.com.farolshopping.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class UsuarioService(var usuarios: List<Usuario>) {

    init {
        val usuario = Usuario(
                id = 1,
                nome = "Ana da Silva",
                email = "ana@email.com.br"
        )
        usuarios = Arrays.asList(usuario)
    }

    fun buscarPorId(idAutor: Long): Usuario {
        return usuarios.stream().filter {
            u -> u.id == idAutor
        }.findFirst().get()
    }

}

package br.com.alura.forum.services

import br.com.alura.forum.model.Curso
import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class UsuarioService (var usuarios: List<Usuario>) {

    init{
        val usuario = Usuario(
            id = 1,
            nome = "Marcionei",
            email = "marcionei@gmail.com"
        )
        val usuario2 = Usuario(
            id = 1,
            nome = "Instrutor Rodrigo",
            email = "instrodrigo@alura.com"
        )
        usuarios = Arrays.asList(usuario, usuario2)
    }

    fun buscarPorId(id: Long): Usuario {
        return usuarios.stream().filter { u ->
            u.id == id
        }.findFirst().get()
    }
}

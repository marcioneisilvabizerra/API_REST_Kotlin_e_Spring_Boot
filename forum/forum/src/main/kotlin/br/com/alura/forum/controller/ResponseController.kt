package br.com.alura.forum.controller

import br.com.alura.forum.dto.NovoTopicoForm
import br.com.alura.forum.dto.ResponseView
import br.com.alura.forum.dto.TopicoView
import br.com.alura.forum.services.ResponseServices
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.util.UriComponentsBuilder
import javax.validation.Valid

@RestController
@RequestMapping("/response")
class ResponseController (val services: ResponseServices){

//    fun incluirResposta(@RequestBody @Valid form: NovoTopicoForm,
//                        uriBuilder: UriComponentsBuilder
//    ): ResponseEntity<ResponseView> {
//        val topicoView = services.cadastrarResposta(form)
//        val uri = uriBuilder.path("/topicos/${topicoView.id}").build().toUri()
//        return ResponseEntity.created(uri).body(topicoView)
}
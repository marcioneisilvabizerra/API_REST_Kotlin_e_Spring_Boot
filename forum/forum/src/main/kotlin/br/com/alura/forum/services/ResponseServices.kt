package br.com.alura.forum.services

import br.com.alura.forum.dto.NovoTopicoForm
import br.com.alura.forum.dto.TopicoView
import br.com.alura.forum.mapper.TopicoFormMapper
import br.com.alura.forum.mapper.TopicoViewMapper
import br.com.alura.forum.model.Resposta
import br.com.alura.forum.model.Topico
import org.springframework.stereotype.Service

@Service
class ResponseServices (
    private var response: List<Resposta> = ArrayList(),

    private val topicoViewMapper: TopicoViewMapper,
    private val topicoFormMapper: TopicoFormMapper
        ){
    fun cadastrarResposta(form: NovoTopicoForm): TopicoView {
        val topico = topicoFormMapper.map(form)
//        topico.id = topicos.size.toLong() + 1
//        topicos = topicos.plus(topico)

        return topicoViewMapper.map(topico)
    }


}

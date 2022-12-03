package br.com.trajanocamargo.e104_ddm1_minha_etec.repository

import br.com.trajanocamargo.e104_ddm1_minha_etec.R
import br.com.trajanocamargo.e104_ddm1_minha_etec.model.ComponenteCurricular
import br.com.trajanocamargo.e104_ddm1_minha_etec.model.Curso
import br.com.trajanocamargo.e104_ddm1_minha_etec.model.Eixo
import br.com.trajanocamargo.e104_ddm1_minha_etec.model.Modulo

class EtecMockRepository {

    val ds = Curso(
        id = 1,
        idResourceImage = 1,
        curso = "Desenvolvimento de Sistemas",
        descricao = "Lorem ipsum dolor sit amet...",
        eixo = Eixo.INFORMACAO_E_COMUNICACAO,
        habilitacoes = mutableListOf("Habilitação I","Habilitação II","Habilitação III"),
        componentes = mutableListOf(
            ComponenteCurricular(id = 1, componente = "Técnicas de Programação", modulo = Modulo.PRIMEIRO),
            ComponenteCurricular(id = 2, componente = "Técnicas de Programação Web I", modulo = Modulo.PRIMEIRO),
            ComponenteCurricular(id = 3, componente = "Banco de Dados I", modulo = Modulo.PRIMEIRO)
        )
    )

    val adm = Curso(
        id = 1,
        idResourceImage = 2,
        curso = "Administração",
        descricao = "Lorem ipsum dolor sit amet...",
        eixo = Eixo.GESTAO_E_NEGOCIOS,
        habilitacoes = mutableListOf("Habilitação I","Habilitação II","Habilitação III"),
        componentes = mutableListOf(
            ComponenteCurricular(id = 1, componente = "Aplicativos Informatizados", modulo = Modulo.PRIMEIRO),
            ComponenteCurricular(id = 2, componente = "Linguagem Tecnologia e Trabalho", modulo = Modulo.PRIMEIRO),
            ComponenteCurricular(id = 3, componente = "Ingkês I", modulo = Modulo.PRIMEIRO)
        )
    )

    val log = Curso(
        id = 1,
        idResourceImage = 5,
        curso = "Logística",
        descricao = "Lorem ipsum dolor sit amet...",
        eixo = Eixo.GESTAO_E_NEGOCIOS,
        habilitacoes = mutableListOf("Habilitação I","Habilitação II","Habilitação III"),
        componentes = mutableListOf(
            ComponenteCurricular(id = 1, componente = "Aplicativos Informatizados", modulo = Modulo.PRIMEIRO),
            ComponenteCurricular(id = 2, componente = "Linguagem Tecnologia e Trabalho", modulo = Modulo.PRIMEIRO),
            ComponenteCurricular(id = 3, componente = "Ingkês I", modulo = Modulo.PRIMEIRO)
        )
    )

    fun getAll(): List<Curso> {
        return listOf(ds, adm, log)
    }
}
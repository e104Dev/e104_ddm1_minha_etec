package br.com.trajanocamargo.e104_ddm1_minha_etec.model

data class Curso(
    val id: Int,
    val idResourceImage: Int,
    val curso: String,
    val descricao: String,
    val eixo: Eixo,
    val componentes:  MutableList<ComponenteCurricular>,
    val habilitacoes: MutableList<String>
)
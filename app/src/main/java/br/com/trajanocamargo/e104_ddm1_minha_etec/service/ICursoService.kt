package br.com.trajanocamargo.e104_ddm1_minha_etec.service

import br.com.trajanocamargo.e104_ddm1_minha_etec.model.Curso

interface ICursoService {
    fun getAll(): List<Curso>
}
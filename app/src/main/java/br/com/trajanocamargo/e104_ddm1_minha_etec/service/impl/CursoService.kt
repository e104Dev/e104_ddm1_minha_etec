package br.com.trajanocamargo.e104_ddm1_minha_etec.service.impl

import br.com.trajanocamargo.e104_ddm1_minha_etec.model.Curso
import br.com.trajanocamargo.e104_ddm1_minha_etec.repository.EtecMockRepository
import br.com.trajanocamargo.e104_ddm1_minha_etec.service.ICursoService

class CursoService(val repository: EtecMockRepository): ICursoService {
    override fun getAll(): List<Curso> {
        return repository.getAll()
    }
}
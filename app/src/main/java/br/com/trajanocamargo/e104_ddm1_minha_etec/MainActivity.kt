package br.com.trajanocamargo.e104_ddm1_minha_etec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.trajanocamargo.e104_ddm1_minha_etec.model.Curso
import br.com.trajanocamargo.e104_ddm1_minha_etec.repository.EtecMockRepository
import br.com.trajanocamargo.e104_ddm1_minha_etec.service.impl.CursoService

class MainActivity : AppCompatActivity() {

    var cursos: List<Curso> = emptyList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val service = CursoService(EtecMockRepository())

        cursos = service.getAll()

        println(service.getAll())
    }
}
package br.com.heiderlopes.primeiroprojeto

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.heiderlopes.primeiroprojeto.Utils.ConstantesExtras

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val peso = intent.extras.getString(ConstantesExtras.KEY_PESO)
    }
}

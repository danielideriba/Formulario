package br.com.heiderlopes.primeiroprojeto

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import br.com.heiderlopes.primeiroprojeto.Utils.ConstantesExtras
import kotlinx.android.synthetic.main.activity_formulario.*

class FormularioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        btnLimpar.setOnClickListener(){
            inputAltura.setText("")
            inputPeso.setText("")
        }

        btnCalcular.setOnClickListener(){
            chamarTelaResultado()
        }
    }

    private fun chamarTelaResultado() {
        val telaResultadoIntent = Intent(this, ResultadoActivity::class.java)
        telaResultadoIntent.putExtra(ConstantesExtras.KEY_PESO, inputPeso.text.toString())
        telaResultadoIntent.putExtra(ConstantesExtras.KEY_ALTURA, inputAltura.text.toString())

        startActivity(telaResultadoIntent)
    }
}
package br.com.heiderlopes.primeiroprojeto

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import br.com.heiderlopes.primeiroprojeto.Utils.ConstantesExtras
import kotlinx.android.synthetic.main.activity_resultado.*
import br.com.heiderlopes.primeiroprojeto.Extensions.format

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val peso = intent.extras.getString(ConstantesExtras.KEY_PESO)
        val altura = intent.extras.getString(ConstantesExtras.KEY_ALTURA)

        calcularIMC(peso.toDouble(), altura.toDouble())
    }

    private fun calcularIMC(peso: Double, altura: Double) {
        val imc = peso / (altura * altura)
        when (imc) {
            in 0..17 -> {
                tvIMC.setText(imc.format(2))
                setImagem(R.drawable.magreza)
                tvIMCDescricao.text = getString(R.string.imcLabel1)
            }
            in 17.1..18.5 -> {
                tvIMC.setText(imc.format(2))
                setImagem(R.drawable.abaixo)
                tvIMCDescricao.text = getString(R.string.imcLabel2)
            }
            in 18.5..24.9 -> {
                tvIMC.setText(imc.format(2))
                setImagem(R.drawable.ideal)
                tvIMCDescricao.text = getString(R.string.imcLabel3)
            }
            in 29.9..34.9 -> {
                tvIMC.setText(imc.format(2))
                setImagem(R.drawable.sobre)
                tvIMCDescricao.text = getString(R.string.imcLabel4)
            }
            in 34.9..39.9 -> {
                tvIMC.setText(imc.format(2))
                setImagem(R.drawable.obesidade)
                tvIMCDescricao.text = getString(R.string.imcLabel5)
            }
            else -> {  }
        }
    }

    private fun setImagem(resourceId: Int){
        ivIMC.setImageDrawable(ContextCompat.getDrawable(this, resourceId))
    }

}

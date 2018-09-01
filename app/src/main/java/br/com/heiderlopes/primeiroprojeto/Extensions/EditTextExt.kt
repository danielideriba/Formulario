package br.com.heiderlopes.primeiroprojeto.Extensions

import android.widget.EditText

fun EditText.meuClear() = this.setText("")
fun EditText.value() = this.text.toString()
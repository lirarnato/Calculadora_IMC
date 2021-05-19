package com.github.lirarnato.calculadora_imc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.main_relative.*


class MainActivity1 : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_relative)
        setListeners()
    }

    private fun setListeners() {
            alturaEDT?.doAfterTextChanged { text ->
                
            }

            pesoEDT?.doOnTextChanged { text, _, _, _ ->
            
        }
        calculaBTN?.setOnClickListener {
            calcularIMC(pesoEDT.text.toString(), alturaEDT.text.toString())
        }
    }

    private fun calcularIMC(peso: String, altura: String) {
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()
        if (peso != null && altura != null){
            val imc = peso / (altura*altura)
            title_TXT.text = "Seu IMC é: \n %.2f".format(imc)
        }
    }
}
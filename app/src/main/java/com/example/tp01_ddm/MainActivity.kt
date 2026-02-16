package com.example.tp01_ddm

import android.animation.TypeConverter
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var resultado: String = ""

        val tvContas = findViewById<TextView>(R.id.tv_display)


        val btnResultado = findViewById<Button>(R.id.btn_igual)
        val btnClear = findViewById<Button>(R.id.btn_c)
        val btnSoma = findViewById<Button>(R.id.btn_mais)
        val btnSubtracao = findViewById<Button>(R.id.btn_menos)
        val btnMultiplica = findViewById<Button>(R.id.btn_multiplica)
        val btnDivide = findViewById<Button>(R.id.btn_divide)
        val btnPonto = findViewById<Button>(R.id.btn_ponto)
        val btnApagar = findViewById<Button>(R.id.btn_apagar)
        val btn0 = findViewById<Button>(R.id.btn_0)
        val btn1 = findViewById<Button>(R.id.btn_1)
        val btn2 = findViewById<Button>(R.id.btn_2)
        val btn3 = findViewById<Button>(R.id.btn_3)
        val btn4 = findViewById<Button>(R.id.btn_4)
        val btn5 = findViewById<Button>(R.id.btn_5)
        val btn6 = findViewById<Button>(R.id.btn_6)
        val btn7 = findViewById<Button>(R.id.btn_7)
        val btn8 = findViewById<Button>(R.id.btn_8)
        val btn9 = findViewById<Button>(R.id.btn_9)

        btnResultado.setOnClickListener {
            val numerosStr = resultado.split(Regex("[-+*/]")).map { it.trim() }
            val listaNumeros = numerosStr.map { it.toDouble() }.toMutableList()

            val listaOperadores = resultado.filter { it == '+' || it == '-' || it == '*' || it == '/' }.map { it.toString() }.toMutableList()

            while (listaOperadores.contains("*") || listaOperadores.contains("/")) {
                var index = listaOperadores.indexOf("*")
                if (index == -1) {
                    index = listaOperadores.indexOf("/")
                }

                val numero1 = listaNumeros[index]
                val numero2 = listaNumeros[index + 1]

                val resultadoOperacao = if (listaOperadores[index] == "*") {
                    numero1 * numero2
                } else {
                    numero1 / numero2
                }

                listaNumeros[index] = resultadoOperacao

                listaNumeros.removeAt(index + 1)

                listaOperadores.removeAt(index)
            }

            while (listaOperadores.contains("+") || listaOperadores.contains("-")){
                var index = listaOperadores.indexOf("+")
                if (index == -1) {
                    index = listaOperadores.indexOf("-")
                }

                val numero1 = listaNumeros[index]
                val numero2 = listaNumeros[index + 1]

                val resultadoOperacao = if (listaOperadores[index] == "+") {
                    numero1 + numero2
                } else {
                    numero1 - numero2
                }

                listaNumeros[index] = resultadoOperacao

                listaNumeros.removeAt(index + 1)

                listaOperadores.removeAt(index)
            }

            resultado = listaNumeros[0].toString()
            tvContas.text = resultado
        }

        btnClear.setOnClickListener {
            resultado = ""
            tvContas.text = "0"
        }

        btnApagar.setOnClickListener {
            if (resultado.isEmpty()) {
                return@setOnClickListener
            }

            resultado = resultado.dropLast(1)

            if (resultado.isEmpty()) {
                tvContas.text = "0"
            } else {
                tvContas.text = resultado
            }
        }


        btnSoma.setOnClickListener {
            resultado += "+"
            tvContas.text = resultado
        }

        btnSubtracao.setOnClickListener {
            resultado += "-"
            tvContas.text = resultado
        }

        btnMultiplica.setOnClickListener {
            resultado += "*"
            tvContas.text = resultado
        }

        btnDivide.setOnClickListener {
            resultado += "/"
            tvContas.text = resultado
        }

        btnPonto.setOnClickListener {
            if(resultado.length != 0 && resultado.last() != '+' && resultado.last() != '-' && resultado.last() != '*' && resultado.last() != '/'){
                resultado += "."
            }
            tvContas.text = resultado
        }

        btn0.setOnClickListener {
            resultado += 0
            tvContas.text = resultado
        }

        btn1.setOnClickListener {
            resultado += 1
            tvContas.text = ""
            tvContas.text = resultado
        }

        btn2.setOnClickListener {
            resultado += 2
            tvContas.text = ""
            tvContas.text = resultado
        }

        btn3.setOnClickListener {
            resultado += 3
            tvContas.text = ""
            tvContas.text = resultado
        }

        btn4.setOnClickListener {
            resultado += 4
            tvContas.text = ""
            tvContas.text = resultado
        }

        btn5.setOnClickListener {
            resultado += 5
            tvContas.text = ""
            tvContas.text = resultado
        }

        btn6.setOnClickListener {
            resultado += 6
            tvContas.text = ""
            tvContas.text = resultado
        }

        btn7.setOnClickListener {
            resultado += 7
            tvContas.text = ""
            tvContas.text = resultado
        }

        btn8.setOnClickListener {
            resultado += 8
            tvContas.text = ""
            tvContas.text = resultado
        }

        btn9.setOnClickListener {
            resultado += 9
            tvContas.text = ""
            tvContas.text = resultado
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nom = findViewById<EditText>(R.id.nombre)
        val mostrar = findViewById<TextView>(R.id.textmostrar)
        val ed = findViewById<EditText>(R.id.edad)

        val btncal = findViewById<Button>(R.id.btncalcular)
        btncal.setOnClickListener() {
            if (nom.text.isEmpty()) {
                Toast.makeText(this, "por favor escribe algo...", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            var numero = Integer.parseInt(ed.getText().toString());
            var resultado = Integer.parseInt(ed.getText().toString());


            if (numero >= 1 || numero <= 9) {
                resultado = numero * numero;
            } else {
                if (numero == 0){
                    Toast.makeText(this,"Ingrese una edad coherente...",Toast.LENGTH_LONG).show()
                }
        }
            if (numero >= 10 || numero <= 99) {
                    var val1=0; var val2=0;
                    val1 = numero % 100 / 10;
                    val2 = numero % 10 / 1;
                    resultado = val1 + val2;
                }else {
                if (numero >= 100) {
                    Toast.makeText(this, "No ingrese esdad de 3 dígitos", Toast.LENGTH_LONG).show()

                }else{
                    if(numero==0)
                        Toast.makeText(this,"tu edad no puede ser 0",Toast.LENGTH_LONG).show()
                }
            }
            var nombres = nom.getText().toString();
            Toast.makeText(
                this,
                "Bienvenido " + nombres + " su numero de la suerte es : " + resultado,
                Toast.LENGTH_LONG
            ).show()
        }

    }
}

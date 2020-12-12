package com.e.primeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //global
    lateinit var nome: TextView;
    lateinit var botao: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botao = findViewById(R.id.botao);
        nome = findViewById(R.id.nome);

        botao.setOnClickListener{
            Toast.makeText(this, "Você clicou no botão!", Toast.LENGTH_LONG).show();
        }

        nome.setText("Primeiro App Kotlin");
        
    }
}
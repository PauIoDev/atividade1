package com.edu.senac.atividade1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void irParaCalculo(View v) {
        Intent i = new Intent(this, CalculoIMC.class);
        startActivity(i);
    }

    public void irParaConversao(View v) {
        Intent i = new Intent(this, Conversao.class);
        startActivity(i);
    }

    public void irParaSobre(View v) {
        Intent i = new Intent(this, Sobre.class);
        startActivity(i);
    }

    public void irParaListaProdutos(View v) {
        Intent i = new Intent(this, ListaProdutos.class);
        startActivity(i);
    }
}

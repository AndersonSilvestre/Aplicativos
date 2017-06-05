package com.example.anderson.exapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

import static android.R.attr.data;
import static com.example.anderson.exapp.R.layout.tela_principal;


public class MainActivity_2 extends AppCompatActivity {

    private Button btn_jogar;
    private Button btn_joken;
    private Button btn_imc;
    public EditText nome_usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(tela_principal);

        nome_usuario = (EditText) findViewById(R.id.nome_usuario);


        final Intent intent = new Intent(getBaseContext(), notificacao_2.class);
        intent.putExtra(notificacao_2.EXTRA_MESSAGE, getResources().getString(R.string.mensagem_2));
        startService(intent);

        btn_jogar = (Button) findViewById(R.id.btn_jogar);
        btn_jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("nome_usuario", ""+nome_usuario.getText());
                intent.setClass(MainActivity_2.this, MainVelha.class);
                startActivity(intent);
            }
        });

        btn_joken = (Button) findViewById(R.id.btn_jokenpo);
        btn_joken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("nome_usuario", ""+nome_usuario.getText());
                intent.setClass(MainActivity_2.this, jokenpo_main.class);
                startActivity(intent);
            }
        });

        btn_imc = (Button) findViewById(R.id.btn_imc);
        btn_imc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity_2.this, imc.class);
                startActivity(intent);
            }
        });

    }
}
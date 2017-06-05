package com.example.anderson.exapp;

import android.content.Intent;
import android.icu.text.UnicodeSet;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;


public class splash_2 extends AppCompatActivity {
    private Button btn_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_3);


        btn_button = (Button) findViewById(R.id.btn_button);
        btn_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(splash_2.this, MainActivity_2.class);
                startActivity(intent);
            }
        });
    }
}
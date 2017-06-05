package com.example.anderson.exapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.Timer;
import java.util.TimerTask;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_2);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                finish();

               Intent intent = new Intent();
               intent.setClass(splash.this, splash_2.class);
               startActivity(intent);
            }
        }, 4000);
    }


}

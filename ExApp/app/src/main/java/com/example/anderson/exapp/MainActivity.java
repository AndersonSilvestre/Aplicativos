package com.example.anderson.exapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import java.util.Timer;
import java.util.TimerTask;
import java.lang.Object;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                finish();

                Intent intent = new Intent();
                intent.setClass(MainActivity.this, splash.class);
                startActivity(intent);
            }
        }, 4000);
    }
}

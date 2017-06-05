package com.example.anderson.exapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;


public class conectado extends BroadcastReceiver {
    public  conectado(){

    }
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals(Intent.ACTION_POWER_CONNECTED));
        Intent startServiceIntent = new Intent(context, notificacao_1.class);
        context.startService(startServiceIntent);
    }
}

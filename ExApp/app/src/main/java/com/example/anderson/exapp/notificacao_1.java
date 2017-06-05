package com.example.anderson.exapp;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import static com.example.anderson.exapp.R.mipmap.ic_launcher;


public class notificacao_1 extends IntentService {

    public static final String EXTRA_MESSAGE = "mensagem";
    public static final int NOTIFICATION_ID = 3153;

    public notificacao_1(){super("notificacao_1"); }


    @Override
    protected void onHandleIntent(Intent intent) {
        synchronized (this){
            try{
                wait(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        String text = intent.getStringExtra(EXTRA_MESSAGE);
        showtext(text);
    }

    private void showtext(String text) {

        text = "Quack";
        Notification notification = new Notification.Builder(this)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("PATO")
                .setAutoCancel(true)
                .setDefaults(Notification.DEFAULT_VIBRATE)
                .setSound( Uri.parse("android.resource://"
                        + getBaseContext().getPackageName() + "/" + R.raw.quack))
                .setContentText(text)
                .build();

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(NOTIFICATION_ID, notification);
    }
}

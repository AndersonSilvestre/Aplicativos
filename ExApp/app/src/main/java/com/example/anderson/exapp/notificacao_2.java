package com.example.anderson.exapp;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;


public class notificacao_2 extends IntentService{
    public static final String EXTRA_MESSAGE = "mensagem_2";
    public static final int NOTIFICATION_ID = 31532;

    public notificacao_2(){super("notificacao_2"); }


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

        text = "QUACK!!";
        Notification notification = new Notification.Builder(this)
                .setSmallIcon(R.drawable.ic_launcher)
                .setContentTitle("QUACK??")
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



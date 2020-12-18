package com.example.a1.lab3salim;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.widget.Toast;

import java.util.Random;

public class PredictionService extends Service {
    public class PredictionServiceBinder extends Binder {
        public PredictionService getService(){
            return PredictionService.this;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new PredictionServiceBinder();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){

        Toast.makeText(this, "Service starting", Toast.LENGTH_SHORT).show();
        return START_STICKY;
    }

    @Override
    public void onDestroy() { Toast.makeText(this, "Service done", Toast.LENGTH_SHORT).show();
    }

    public String predictCloseFuture(){
        Predictions prediction = new Predictions();
        Random random = new Random();
        int predictionNum =  random.nextInt(3);
        String[] array = prediction.getClosePredictions();
        return array[predictionNum];
    }

    public String predictFarFuture(){
        Predictions prediction = new Predictions();
        Random random = new Random();
        int predictionNum =  random.nextInt(3);
        String[] array = prediction.getFarPredictions();
        return array[predictionNum];
    }
}


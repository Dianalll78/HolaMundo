package com.Diana.ProyectoGrupo08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.WindowManager;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScrenActivity extends AppCompatActivity {
    /*tiempo que durara el pantallazo de splash screen*/
    private static final long SPLASH_SCREEN_DELAY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*bloquear orientacion de pantalla*/
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        /*ocultar barra de notificaciones*/
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
                );
        setContentView(R.layout.activity_splash_scren);
        //ocultar ActionBar*//
        getSupportActionBar().hide();

        /*definir el tiempo que permanece la imagen de inicio de aplicacion*/
        /*crear una tarea de temporizacion*/
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                /*lanzar la actividad principal*/
                Intent newIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(newIntent); /*inicializa la actididad*/
                finish();
            }
        };

        Timer timer = new Timer();
        timer.schedule(timerTask, SPLASH_SCREEN_DELAY);

    }

}
package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    /*se ejecuta antes de que se pueda ver la activity*/
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Metodo Oncreate()", Toast.LENGTH_SHORT).show();

    }

    /*Metodo para llamar la actividad producto, con este metodo me muevo a traves de todas las act*/
    public void goToActivityProducto(View view){
        Intent newIntent = new Intent(this,ProductoActivity.class); /*definicion de la intencion*/
        newIntent.putExtra("msg","Hola MinTic");
        newIntent.putExtra("year", 2022);
        newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); /*bandera para que destruya las otras act y ponga la que llamo arriba de la pila*/
        startActivity(newIntent); /*inicio de una nueva instancia de la activity principal pasando intent a startActivity*/
    }
    /*se ejecuta cuando la actividad esta a punto de ser visible para el usuario*/
    protected void onStart() {
        super.onStart();
//        Toast.makeText(this, "Metodo OnStart()", Toast.LENGTH_SHORT).show();
    }

    protected void onResume() {
        super.onResume();
//        Toast.makeText(this, "Metodo OnResume()", Toast.LENGTH_SHORT).show();
    }

    protected void onPause() {
        super.onPause();
//        Toast.makeText(this, "Metodo OnPause()", Toast.LENGTH_SHORT).show();
    }

    protected void onRestart() {
        super.onRestart();
//        Toast.makeText(this, "Metodo OnRestart()", Toast.LENGTH_SHORT).show();
    }

    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Metodo OnDestroy()", Toast.LENGTH_SHORT).show();
    }
}
package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ProductoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); /*activa el soporte para la actionbar*/
        getParametros();                  /*llamado del metodod getParametros*/
    }

    public void getParametros() {
        Bundle extras = getIntent().getExtras(); /*tengo los extras en la variable extras*/
        String msg = extras.getString("msg"); /*captura de mensaje Hola*/
        Integer year = extras.getInt("year"); /*captra de variable año 2021*/
        Toast.makeText(this, msg + " " + year, Toast.LENGTH_SHORT).show(); /*lo que se va a mostrar*/

    }

    public void goToActivityMain(View view){
        Intent newIntent = new Intent(this,MainActivity.class); /*definicion de la intencion*/
        newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(newIntent); /*inicio de una nueva instancia de la activity principal pasando intent a startActivity*/
    }

    /*metodo que muestra felchita parte superior para regresar y finalizar la actibidad*/
    public void onBackPress(){
        finish();
    }

    /*metodo que le indica a Android como es que va activar el metodo onBackExpress*/
    public boolean onOptionsItemSelected (MenuItem menuItem) {
        int id = menuItem.getItemId();  /*devuelve codigo que se debe comparar para hacer la llamada*/

        if (id == android.R.id.home) { /*compara si el codigo es igual al de la variable*/
            onBackPress();
        }
        return super.onOptionsItemSelected(menuItem);

    }

}
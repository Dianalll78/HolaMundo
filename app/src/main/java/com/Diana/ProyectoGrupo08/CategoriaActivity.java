package com.Diana.ProyectoGrupo08;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

public class CategoriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); /*activa el soporte para la actionbar*/
    }

    public void onBackPress(){
        finish();
    }

    public boolean onOptionsItemSelected (MenuItem menuItem) {
        int id = menuItem.getItemId();  /*devuelve codigo que se debe comparar para hacer la llamada*/

        if (id == android.R.id.home) { /*compara si el codigo es igual al de la variable*/
            onBackPress();
        }
        return super.onOptionsItemSelected(menuItem);

    }
}
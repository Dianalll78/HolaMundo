package com.Diana.ProyectoGrupo08;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
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

    /*Metodo para llamar la actividad producto,por medio de un boton con este metodo me muevo a traves de todas las act*/
    public void goToActivityProducto(View view) {
        Intent newIntent = new Intent(this, ProductoActivity.class); /*definicion de la intencion*/
        newIntent.putExtra("msg", "Hola MinTic");
        newIntent.putExtra("year", 2022);
        newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); /*bandera para que destruya las otras act y ponga la que llamo arriba de la pila*/
        startActivity(newIntent); /*inicio de una nueva instancia de la activity principal pasando intent a startActivity*/
    }

    @Override
    /*metodo que va a mostrar el menu*/
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    /*metodo para ejecucion de boton menu*/
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int id = menuItem.getItemId();  /*cuando el usuario toca el menu,guarda el cod del id que tcoc el usuario en la variable id, para despues compararlo en el if*/

        if (id == R.id.menu_producto) { /*compara si el usuario toco producto haga algo*/
            /*cuando el usuario de clic en menu_producto,llame a esa activity*/
            Intent newIntent = new Intent(this, ProductoActivity.class);
            newIntent.putExtra("msg", "Hola MinTic");
            newIntent.putExtra("year", 2022);
            newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); /*bandera para que destruya las otras act y ponga la que llamo arriba de la pila*/
            startActivity(newIntent); /*inicio de una nueva instancia de la activity principal*/

        } else if (id == R.id.menu_categoria) {
            Intent newIntent = new Intent(this, CategoriaActivity.class);
            newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); /*bandera para que destruya las otras act y ponga la que llamo arriba de la pila*/
            startActivity(newIntent); /*inicio de una nueva instancia de la activity princip*/

        }

        return super.onOptionsItemSelected(menuItem);
    }

    /*metodo para cuadro de dialogo que pregunta si el usuario desea salir de la app*/
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {  /*si el codigo keyCode es igual al KeyEvente para ir atras*/
            new AlertDialog.Builder(this, R.style.Theme_AppCompat_Dialog_Alert)  /*construccion del dialogo con el estilo*/
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .setTitle("Informacion")
                    .setMessage("¿Desea cerrar la aplicacion?")    /*sentencias de creacion de titulo dialogo,informacion y mensaje*/
                    .setNegativeButton("No", null)
                    .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            MainActivity.this.finish();
                        }
                    }).show(); /*muestra*/
            return true;

        }

        return super.onKeyDown(keyCode, event);

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


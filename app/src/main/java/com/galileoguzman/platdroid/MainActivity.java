package com.galileoguzman.platdroid;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.parse.*;


public class MainActivity extends ActionBarActivity {

    private EditText curso;
    private EditText profesor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Extraer el valor de los campos de texto de la vista
        //Asignar valores a propiedades de nuestra clase
        //TypeCasting
        this.curso = (EditText)findViewById(R.id.txtNombreCurso);
        this.profesor = (EditText)findViewById(R.id.txtProfesor);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void guardarCurso(View view){
        //Crear un objeto de la clase ParseObject
        ParseObject testObject = new ParseObject("cursos");
        //asignar valores a nuestro objeto


        String name = String.valueOf(this.curso.getText());

        String desc = String.valueOf(this.profesor.getText());

        testObject.put("nombre", name );
        testObject.put("profesor", desc);

        testObject.saveInBackground();
        this.curso = null;
        this.profesor = null;
    }

}

package com.lab02.sharedpreferenceslab6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private SharePreferenceHandler sharePreferenceHandler;
    private EditText n_emp;
    private EditText encargado;
    private EditText ubicacion;
    private EditText correo;
    private EditText telefono;
    private EditText RUC;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharePreferenceHandler=new SharePreferenceHandler(this);
        n_emp = (EditText) findViewById(R.id.n_emp);
        encargado = (EditText) findViewById(R.id.encargado);
        ubicacion = (EditText) findViewById(R.id.ubicacion);
        correo = (EditText) findViewById(R.id.email);
        telefono = (EditText) findViewById(R.id.telefono);
        RUC = (EditText) findViewById(R.id.ruc);

    }
/*
    public void onPause(){
    super.onPause();
    sharePreferenceHandler.saveValue("n_emp",n_emp.getText().toString());
    sharePreferenceHandler.saveValue("encargado",encargado.getText().toString());
    sharePreferenceHandler.saveValue("ubicacion",ubicacion.getText().toString());
    sharePreferenceHandler.saveValue("correo",correo.getText().toString());
    sharePreferenceHandler.saveValue("telefono",telefono.getText().toString());
    sharePreferenceHandler.saveValue("ruc",RUC.getText().toString());

    sharePreferenceHandler.deleteValue("n_emp");
    sharePreferenceHandler.deleteValue("encargado");
    sharePreferenceHandler.deleteValue("ubicacion");
    sharePreferenceHandler.deleteValue("correo");
    sharePreferenceHandler.deleteValue("telefono");
    sharePreferenceHandler.deleteValue("ruc");

    }
*/


    public void Guardar(View view){
        sharePreferenceHandler.saveValue("n_emp",n_emp.getText().toString());
        sharePreferenceHandler.saveValue("encargado",encargado.getText().toString());
        sharePreferenceHandler.saveValue("ubicacion",ubicacion.getText().toString());
        sharePreferenceHandler.saveValue("correo",correo.getText().toString());
        sharePreferenceHandler.saveValue("telefono",telefono.getText().toString());
        sharePreferenceHandler.saveValue("ruc",RUC.getText().toString());
    }
    public void Eliminar(View view){
        sharePreferenceHandler.deleteValue("n_emp");
        sharePreferenceHandler.deleteValue("encargado");
        sharePreferenceHandler.deleteValue("ubicacion");
        sharePreferenceHandler.deleteValue("correo");
        sharePreferenceHandler.deleteValue("telefono");
        sharePreferenceHandler.deleteValue("ruc");
    }


    public void onResume(){
        super.onResume();
        n_emp.setText(sharePreferenceHandler.getValue("n_emp"));
        encargado.setText(sharePreferenceHandler.getValue("encargado"));
        ubicacion.setText(sharePreferenceHandler.getValue("ubicacion"));
        correo.setText(sharePreferenceHandler.getValue("correo"));
        telefono.setText(sharePreferenceHandler.getValue("telefono"));
        RUC.setText(sharePreferenceHandler.getValue("ruc"));

    }

}
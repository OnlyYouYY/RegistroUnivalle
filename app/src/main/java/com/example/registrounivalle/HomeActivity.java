package com.example.registrounivalle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class HomeActivity extends AppCompatActivity {
    private TextView txtResultado;

    private Producto producto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        inicializarVistas();
        recibirDatosFormatoObjeto();
        mostrarInformacion();

    }

    private void mostrarInformacion() {
        txtResultado.setText(producto.toString());
    }

    private void recibirDatosFormatoObjeto() {
      producto = (Producto) this.getIntent().getExtras().getSerializable("producto_objeto");
    }

    private void inicializarVistas() {
        txtResultado = findViewById(R.id.txtResultado);
    }
}
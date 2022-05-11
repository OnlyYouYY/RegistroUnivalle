package com.example.registrounivalle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Atributos -> representan sus vistas
    private EditText etCodigoP, etCategoriaP, etNombreP, etCantidadP, etPrecioP, etTipoCambioP, etEstadoP;
    private Button btnRegistrar;


    private Producto producto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVistas();


        btnRegistrar.setOnClickListener(view -> {
            obtenerInformacionProducto();
            pasarPantallaEnviandoObjeto();
        });
    }

    private void obtenerInformacionProducto() {
        producto = new Producto(
                Integer.parseInt(etCodigoP.getText().toString()),
                etCategoriaP.getText().toString(),
                etNombreP.getText().toString(),
                Integer.parseInt(etCantidadP.getText().toString()),
                Integer.parseInt(etPrecioP.getText().toString()),
                etTipoCambioP.getText().toString(),
                etEstadoP.getText().toString()
        );

    }

    private void pasarPantallaEnviandoObjeto() {
        Intent i = new Intent(this, HomeActivity.class);
        Bundle archivo = new Bundle();
        archivo.putSerializable("producto_objeto", producto);
        i.putExtras(archivo);
        startActivity(i);
    }


    private void inicializarVistas() {
        etCodigoP = findViewById(R.id.etCodigoP);
        etCategoriaP = findViewById(R.id.etCategoriaP);
        etNombreP = findViewById(R.id.etNombreP);
        etCantidadP = findViewById(R.id.etCantidadP);
        etPrecioP = findViewById(R.id.etPrecioP);
        etTipoCambioP = findViewById(R.id.etTipoCambioP);
        etEstadoP = findViewById(R.id.etEstadoP);
        btnRegistrar = findViewById(R.id.btnRegistrar);
    }
}
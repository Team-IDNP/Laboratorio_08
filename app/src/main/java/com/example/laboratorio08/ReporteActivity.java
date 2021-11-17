package com.example.laboratorio08;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReporteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte);

        Intent intent = getIntent();
        String departamento = intent.getStringExtra("Departamento");
        String provincia = intent.getStringExtra("Provincia");
        String distrito = intent.getStringExtra("Distrito");

        TextView txt;
        txt = findViewById(R.id.txtDepartamento);
        txt.setText(departamento);

        txt = findViewById(R.id.txtProvincia);
        txt.setText(provincia);

        txt = findViewById(R.id.txtDistrito);
        txt.setText(distrito);
    }

}

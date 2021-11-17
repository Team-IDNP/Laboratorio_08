package com.example.laboratorio08;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recicler;
    private List<Reporte> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recicler = findViewById(R.id.recycler);
        recicler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        list = ReporteGenerator.generar(50);

        ReporteAdapter rAdapter = new ReporteAdapter(list);


        recicler.setAdapter(rAdapter);
        Log.e("a", "recicler.");

    }
}
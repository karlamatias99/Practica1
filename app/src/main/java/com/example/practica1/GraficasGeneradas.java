package com.example.practica1;

import android.os.Bundle;

import com.example.practica1.Graficas.*;
import com.example.practica1.UI.Draw;

import java.util.ArrayList;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import java.security.NoSuchAlgorithmException;

public class GraficasGeneradas extends AppCompatActivity{

    ArrayList<OperadorFinded> reporteOperadores = new ArrayList<OperadorFinded>();
    ArrayList<GraficasFinded> reporteGraficas = new ArrayList<GraficasFinded>();
    ArrayList<ObjetoFinded> reporteObjetos = new ArrayList<ObjetoFinded>();
    //Array de graficas
    ArrayList<Graficas> graficas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graficas_generadas);
        try {
            recibirGraficas();
            recibirOperadores();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        //Se agregan las formas pintadas en el Layout
        ConstraintLayout layout1 = findViewById(R.id.resultado);
        Draw fondo = new Draw(this, graficas);
        layout1.addView(fondo);
    }

    //Metodo para recibir las formas del Activity anterior
    private void recibirGraficas() throws NoSuchAlgorithmException {
        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("Bundle");
        graficas = (ArrayList<Graficas>) args.getSerializable("graficasEncontradas");
    }

    //Metodo para recibir los operadores del Activity anterior
    private void recibirOperadores() throws NoSuchAlgorithmException {
        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("Bundle");
        reporteOperadores = (ArrayList<OperadorFinded>) args.getSerializable("operadoresEncontrados");
    }

    /* Boton de ver Reporte de graficas */
    public void verReporteGraficas(View view) {
        //Intenta enviar objetos encontradas al siguiente Activity
        try {
            if (reporteGraficas.size()!=0) {
                Intent intent = new Intent(this, Reportes.class);
                //Crea bundle con array serializable
                Bundle args = new Bundle();
                args.putSerializable("graficasEncontradas", reporteGraficas);
                intent.putExtra("Bundle", args);
                startActivity(intent);
            }
        } catch (Exception ex) {
        }
    }

    public void verReporteOperadores(View view) {
        //Intenta enviar formas encontradas al siguiente Activity
        try {
            if (reporteOperadores.size()!=0) {
                Intent intent = new Intent(this, Reportes.class);
                //Crea bundle con array serializable
                Bundle args = new Bundle();
                args.putSerializable("operadoresEncontrados", reporteOperadores);
                intent.putExtra("Bundle", args);
                startActivity(intent);
            }
        } catch (Exception ex) {

        }
    }
}



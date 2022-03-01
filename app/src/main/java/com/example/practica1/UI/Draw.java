package com.example.practica1.UI;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

import com.example.practica1.Graficas.Barras;
import com.example.practica1.Graficas.Graficas;

import java.util.ArrayList;


public class Draw extends View {
    private final ArrayList<Graficas> graficas;

    //Constructor
    public Draw(Context context, ArrayList<Graficas> graficas) {
        super(context);
        this.graficas = graficas;
    }

    /*Nuevo metodo onDraw*/
    protected void onDraw(Canvas canvas) {

        Paint pincel = new Paint();
        /*Seleccion de forma por pintar*/
        for (Graficas graficaElegida : graficas) {

            /* if (graficaElegida.getTipo().equals("Barras")) {
                pincel = asignarColor(formaElegida.getColor());
                Barras nuevaBarras = (Barras) graficaElegida;
                canvas.(nuevoCirculo.posx(), nuevoCirculo.posy(), nuevoCirculo.getRadio(), pincel);

                /*CUADRADO*/
           /* } else if (formaElegida.getTipo().equals("cuadrado")) {
                pincel = asignarColor(formaElegida.getColor());
                Cuadrado nuevoCuadrado = (Cuadrado) formaElegida;
                Path path = new Path();
                path.moveTo(nuevoCuadrado.posx(), nuevoCuadrado.posy());
                path.lineTo(nuevoCuadrado.posx() + nuevoCuadrado.getTamanioLado(), nuevoCuadrado.posy());
                path.lineTo(nuevoCuadrado.posx() + nuevoCuadrado.getTamanioLado(), nuevoCuadrado.posy() + nuevoCuadrado.getTamanioLado());
                path.lineTo(nuevoCuadrado.posx(), nuevoCuadrado.posy() + nuevoCuadrado.getTamanioLado());
                canvas.drawPath(path, pincel);


        }*/
        }
    }
}

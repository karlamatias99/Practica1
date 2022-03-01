package com.example.practica1.Graficas;


import java.io.Serializable;

//Objeto serializable para poder mandarlo entre Activitys
public class GraficasFinded implements Serializable {
    //Atributos
    private String grafica;
    private int cantidad;

    //Constructor
    public GraficasFinded(String grafica, int cantidad) {
        this.grafica=grafica;
        this.cantidad=cantidad;
    }

    //Metodos
    public String getGrafica() {
        return grafica;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setGrafica(String grafica) {
        this.grafica = grafica;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}

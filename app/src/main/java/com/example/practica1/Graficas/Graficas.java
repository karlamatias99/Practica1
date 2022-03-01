package com.example.practica1.Graficas;
import java.io.Serializable;

//Objeto serializable para poder mandarlo entre Activitys
public class Graficas implements Serializable {

    private  String tipodeGrafica;
    private String titulo;
    private int unir1;
    private int unir2;
    private int unir3;
    private int unir4;

    //Constructor


    public Graficas(String tipodeGrafica, String titulo, int unir1, int unir2, int unir3, int unir4) {
        this.tipodeGrafica = tipodeGrafica;
        this.titulo = titulo;
        this.unir1 = unir1;
        this.unir2 = unir2;
        this.unir3 = unir3;
        this.unir4 = unir4;
    }

    public String getTipodeGrafica() {
        return tipodeGrafica;
    }

    public void setTipodeGrafica(String tipodeGrafica) {
        this.tipodeGrafica = tipodeGrafica;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getUnir1() {
        return unir1;
    }

    public void setUnir1(int unir1) {
        this.unir1 = unir1;
    }

    public int getUnir2() {
        return unir2;
    }

    public void setUnir2(int unir2) {
        this.unir2 = unir2;
    }

    public int getUnir3() {
        return unir3;
    }

    public void setUnir3(int unir3) {
        this.unir3 = unir3;
    }

    public int getUnir4() {
        return unir4;
    }

    public void setUnir4(int unir4) {
        this.unir4 = unir4;
    }
}

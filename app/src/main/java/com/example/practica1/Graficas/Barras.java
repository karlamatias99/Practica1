package com.example.practica1.Graficas;

import com.example.practica1.Analizador.Token;

//Objeto serializable para poder mandarlo entre Activitys
public class Barras extends Graficas {

    //Atributos

    private String ejex1;
    private String ejex2;
    private int ejey1;
    private int ejey2;

    public Barras(String tipodeGrafica, String titulo, int unir1, int unir2, int unir3, int unir4, String ejex1, String ejex2, int ejey1, int ejey2) {
        super(tipodeGrafica, titulo, unir1, unir2, unir3, unir4);
        this.ejex1 = ejex1;
        this.ejex2 = ejex2;
        this.ejey1 = ejey1;
        this.ejey2 = ejey2;
    }


    public String getEjex1() {
        return ejex1;
    }

    public void setEjex1(String ejex1) {
        this.ejex1 = ejex1;
    }

    public String getEjex2() {
        return ejex2;
    }

    public void setEjex2(String ejex2) {
        this.ejex2 = ejex2;
    }

    public int getEjey1() {
        return ejey1;
    }

    public void setEjey1(int ejey1) {
        this.ejey1 = ejey1;
    }

    public int getEjey2() {
        return ejey2;
    }

    public void setEjey2(int ejey2) {
        this.ejey2 = ejey2;
    }
}

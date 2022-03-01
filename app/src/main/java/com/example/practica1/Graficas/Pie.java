package com.example.practica1.Graficas;


import com.example.practica1.Analizador.Token;

//Objeto serializable para poder mandarlo entre Activitys
public class Pie extends Graficas {

    //Atributos
    private String etiquetas1;
    private  String etiquetas2;
    private int valores1;
    private int valores2;
    private  String tipo;
    private String extra;

    public Pie(String tipodeGrafica, String titulo, int unir1, int unir2, int unir3, int unir4, String etiquetas1, String etiquetas2, int valores1, int valores2, String tipo, String extra) {
        super(tipodeGrafica, titulo, unir1, unir2, unir3, unir4);
        this.etiquetas1 = etiquetas1;
        this.etiquetas2 = etiquetas2;
        this.valores1 = valores1;
        this.valores2 = valores2;
        this.tipo = tipo;
        this.extra = extra;
    }


    public String getEtiquetas1() {
        return etiquetas1;
    }

    public void setEtiquetas1(String etiquetas1) {
        this.etiquetas1 = etiquetas1;
    }

    public String getEtiquetas2() {
        return etiquetas2;
    }

    public void setEtiquetas2(String etiquetas2) {
        this.etiquetas2 = etiquetas2;
    }

    public int getValores1() {
        return valores1;
    }

    public void setValores1(int valores1) {
        this.valores1 = valores1;
    }

    public int getValores2() {
        return valores2;
    }

    public void setValores2(int valores2) {
        this.valores2 = valores2;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
}

//Packages
package com.example.practica1.Graficas;

import java.io.Serializable;

//Objeto serializable para poder mandarlo entre Activitys
public class ObjetoFinded implements Serializable {
    //Atributos
    private String objeto;
    private int cantidad;

    //Constructor
    public ObjetoFinded(String objeto, int cantidad) {
        this.objeto=objeto;
        this.cantidad=cantidad;
    }

    //Metodos
    public String getObjeto() {
        return objeto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}

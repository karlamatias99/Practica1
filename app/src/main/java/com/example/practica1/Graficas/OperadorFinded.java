//Packages
package com.example.practica1.Graficas;

import java.io.Serializable;

//Objeto serializable para poder mandarlo entre Activitys
public class OperadorFinded implements Serializable {
    //Atributos
    private String operador;
    private int linea;
    private int columna;
    private String ocurrencia;

    //Constructor
    public OperadorFinded(String operador, int linea, int columna, String ocurrencia) {
        this.operador = operador;
        this.linea = linea;
        this.columna = columna;
        this.ocurrencia = ocurrencia;
    }

    //Metodos
    public String getOperador() {
        return operador;
    }

    public int getLinea() {
        return linea;
    }

    public int getColumna() {
        return columna;
    }

    public String getOcurrencia() {
        return ocurrencia;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public void setColumna(int columna) { this.columna = columna; }

    public void setOcurrencia(String ocurrencia) {
        this.ocurrencia = ocurrencia;
    }

}

//Packages
package com.example.practica1.Graficas;

import java.io.Serializable;

//Objeto serializable para poder mandarlo entre Activitys
public class ErrorFinded implements Serializable {
    //Atributos
    private String lexema;
    private int linea;
    private int columna;
    private String tipo;
    private String descripcion;

    //Constructor
    public ErrorFinded(String lexema, int linea, int columna, String tipo, String descripcion) {
        this.lexema = lexema;
        this.linea = linea;
        this.columna = columna;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    //Metodos
    public String getLexema() {
        return lexema;
    }

    public int getLinea() {
        return linea;
    }

    public int getColumna() {
        return columna;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public void setColumna(int columna) { this.columna = columna; }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}

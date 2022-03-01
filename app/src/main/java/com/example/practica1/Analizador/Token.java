/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.practica1.Analizador;

/**
 *
 * @author karlamatias
 */
public class Token {
    //Atributos
    private final String lexeme;
    private final int line;
    private final int column;
    //Constructor
    public Token(String lexema, int linea, int columna) {
        this.lexeme = lexema;
        this.line = linea;
        this.column = columna;
    }
    //Metodos
    public Token(int fila, int columna) {
        this(null, fila, columna);
    }


    public String getLexeme() {
        return lexeme;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }
}

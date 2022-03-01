
/*Seccion codigo de usuario*/

package com.example.practica1.Analizador;
import com.example.practica1.Analizador.sym;
import java_cup.runtime.*;
import com.example.practica1.Graficas.*;
import java.io.Reader;
import java.util.ArrayList;
%%

/*Seccion configuracion*/
%class GraficasLexer
%cup
%unicode
%line
%column
%public

//Metodos
%{
      private ArrayList<ErrorFinded> reporteErrorList= new ArrayList<ErrorFinded>();

      //Retorna list de errores sintacticos
        public ArrayList getReporteErrorsList(){
	        return reporteErrorList;
	    }

      private Symbol symbol(int type, String lexema) {
        return new Symbol(type, new Token(lexema, yyline + 1, yycolumn + 1));
      }

%}

//Palabras reservadas y tokens validos
SEPARADOR = \r|\r\n|\n
ESPACIO = {SEPARADOR} | [ \t\f]
ENTERO=([0-9]+)
BARRAS = ("Barras")
PIE = ("Pie")
EJECUTAR = ("Ejecutar")
TITULO = ("titulo")
TIPOS = ("tipo")
EJEX = ("ejex")
EJEY = ("ejey")
UNIR = ("unir")
VALORES = ("valores")
ETIQUETA = ("etiquetas")
EXTRA = ("extra")
TOTAL = ("total")
TIPO = ("Porcentaje"|"Cantidad")
DEFINIR = ("Def"|"def")
IDENTIFICADOR = [a-zA-Z](_?[a-zA-Z0-9])*
//COMENTARIO = [#][a-zA-Z]*
SUMA="+"
RESTA=("-")
MULTIPLICACION=("*")
DIVISION=("/")
PARENTESISA=("(")
PARENTESISB=(")")
COMA=(",")
PTCOMA = ";"
DOSPUNTOS = ":"
LLAVE_ABRE = ("{")
LLAVE_CIERRA = ("}")
CORCHETE_ABRE = ("[")
CORCHETE_CIERRA = ("]")

%%

/*Seccion Reglas Lexicas*/

<YYINITIAL>{

{SEPARADOR} {/*Ignora el separador*/}
{ESPACIO} {/*Ignora el espacio*/}
{ENTERO} {return new Symbol(sym.ENTERO,yytext()); }
{BARRAS} {return new Symbol(sym.BARRAS,yytext()); }
{PIE} {return new Symbol(sym.PIE,yytext()); }
{EJECUTAR} {return new Symbol(sym.EJECUTAR,yytext()); }
{TITULO} {return new Symbol(sym.TITULO,yytext()); }
{TIPOS} {return new Symbol(sym.TIPOS,yytext()); }
{EJEX} {return new Symbol(sym.EJEX,yytext()); }
{EJEY} {return new Symbol(sym.EJEY,yytext()); }
{UNIR} {return new Symbol(sym.UNIR,yytext()); }
{VALORES} {return new Symbol(sym.VALORES,yytext()); }
{ETIQUETA} {return new Symbol(sym.ETIQUETA,yytext()); }
{EXTRA} {return new Symbol(sym.EXTRA,yytext()); }
{TOTAL} {return new Symbol(sym.TOTAL,yytext()); }
{TIPO} {return new Symbol(sym.TIPO,yytext()); }
{DEFINIR} {return new Symbol(sym.DEFINIR,yytext()); }
{IDENTIFICADOR} { return new Symbol(sym.IDENTIFICADOR,yytext());  }
//{COMENTARIO}	 { return new Symbol(sym.COMENTARIO);  }
{SUMA} {return new Symbol(sym.SUMA,yytext()); }
{RESTA} {return new Symbol(sym.RESTA,yytext()); }
{MULTIPLICACION} {return new Symbol(sym.MULTIPLICACION,yytext()); }
{DIVISION} {return new Symbol(sym.DIVISION,yytext()); }
{PARENTESISA} {return new Symbol(sym.PARENTESISA,yytext()); }
{PARENTESISB} {return new Symbol(sym.PARENTESISB,yytext()); }
{COMA} {return new Symbol(sym.COMA,yytext()); }
{DOSPUNTOS} {return new Symbol(sym.DOSPUNTOS,yytext()); }
{PTCOMA} {return new Symbol(sym.PTCOMA,yytext()); }
{LLAVE_ABRE} {return new Symbol(sym.LLAVE_ABRE,yytext()); }
{LLAVE_CIERRA} {return new Symbol(sym.LLAVE_CIERRA,yytext()); }
{CORCHETE_ABRE} {return new Symbol(sym.CORCHETE_ABRE,yytext()); }
{CORCHETE_CIERRA} {return new Symbol(sym.CORCHETE_CIERRA,yytext()); }

}

/*Errores y signos encontrados*/
[^] { reporteErrorList.add(new ErrorFinded(yytext(),yyline + 1,yycolumn + 1,"Lexico","Símbolo no existe en el lenguaje"));
  return symbol(sym.error,yytext()); }

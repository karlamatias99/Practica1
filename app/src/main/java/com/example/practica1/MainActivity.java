package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

import com.example.practica1.Graficas.*;
import com.example.practica1.Analizador.*;

import java.io.StringReader;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText editEntrada;
    private EditText errorEntrada;
    private ArrayList<ErrorFinded> reporteErrores;
    private ArrayList<OperadorFinded> reporteOperadores;
    private ArrayList<Graficas> reporteGraficas;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


        /* Boton de compilar */
        public void compilar (View view){

            //recibiendo los componentes del activity main
            editEntrada = findViewById(R.id.Texto);
            errorEntrada = findViewById(R.id.editTextError);
            String entrada = editEntrada.getText().toString();
            StringReader reader = new StringReader(entrada);
            errorEntrada.getText().clear();
            // ArrayList de graficas
            ArrayList<Graficas> graficas;
            ArrayList<String> errores;
            GraficasLexer lexico = new GraficasLexer(reader);
            GraficasParser parser = new GraficasParser(lexico);

            //Intenta enviar formas encontradas al siguiente Activity
            try {
                parser.parse();
                //Formas
                graficas = parser.getGraficasList();
                //Errores
                errores = parser.getErrorsList();
                reporteErrores = new ArrayList<ErrorFinded>();
                reporteErrores.addAll(parser.getReporteErrorsList());
                reporteErrores.addAll(lexico.getReporteErrorsList());
                //Operadores
                reporteOperadores = parser.getOperadoresList();

                //Graficas
                reporteGraficas = parser.getGraficaList();
                reporteErrores = parser.getErrorsList();

                for (String erroresEncontrados : errores) {
                    errorEntrada.setText(errorEntrada.getText() + erroresEncontrados);
                    if (graficas!=null) {
                        Intent intent = new Intent(this, GraficasGeneradas.class);
                        //Crea bundle con array serializable
                        Bundle args = new Bundle();
                        args.putSerializable("graficasEncontradas", graficas);
                        if (reporteOperadores.size()!=0) {
                            args.putSerializable("operadoresEncontrados", reporteOperadores);
                        }

                        intent.putExtra("Bundle", args);
                        startActivity(intent);
                    }


                }

            } catch (Exception ex) {
                errores = parser.getErrorsList();
                for (String erroresEncontrados : errores) {
                    errorEntrada.setText(errorEntrada.getText() + erroresEncontrados + "\n");
                }
            }

        }

        /* Boton de verReporte */
        public void verReporte (View view){

            //Intenta enviar formas encontradas al siguiente Activity
            try {
                if (reporteErrores.size() != 0) {
                    Intent intent = new Intent(this, Reportes.class);
                    //Crea bundle con array serializable
                    Bundle args = new Bundle();
                    args.putSerializable("erroresEncontrados", reporteErrores);
                    intent.putExtra("Bundle", args);
                    startActivity(intent);
                }

            } catch (Exception ex) {

            }

        }

    }


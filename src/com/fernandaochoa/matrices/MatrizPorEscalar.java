package com.fernandaochoa.matrices;

/*MatrizPorEscalar.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Días y horario del curso
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #: 69
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

import cstio.Dialog;
import cstio.Pizarra;

public class MatrizPorEscalar {
    Dialog d = new Dialog();

    private float datos[][];
    private float totales[][];
    private char operadores[];

    private int filas, columnas;
    private float escalar;
    String a;

    public boolean isNum(String cad) {
        try {
            Integer.parseInt(cad);
            return true;
        } catch (NumberFormatException nfe) {
            d.display("Solo se aceptan numeros");
            return false;
        }
    }

    public void inicio() {
        d.display("Programa para hacer aritmetica con los datosLados de una matriz");
    }

    public void tamaño() {
        String t;
        do t = d.readString("Cual es la cantidad de filas?");
        while (!isNum(t));
        filas = Integer.parseInt(t);

        do t = d.readString("Cual es el numero de columnas?");
        while (!isNum(t));
        columnas = Integer.parseInt(t);

        datos = new float[filas][columnas];
        totales = new float[filas][columnas];
        operadores = new char[(filas * columnas)];
    }

    public void datos() {
        String v;
        int numero = 0, k = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                do v = d.readString("Ingresa el valor para la posicion " + (i + 1) + ", " + (j + 1));
                while (!isNum(v));
                numero = Integer.parseInt(v);
                datos[i][j] = numero;
            }
        }
        escalar();
    }

    public void escalar() {
        String e;
        int numero;
        do e = d.readString("introduce el valor del escalar");
        while (!isNum(e));
        escalar = Float.parseFloat(e);
    }

    public void aritmetica() {
        a = d.readString("Ingresa el signo de la operacion aritmetica\n"
                + "que deseas hacer\n"
                + "'+' suma\n"
                + "'-' resta\n"
                + "'/' division\n"
                + "'*' multiplicacion");
    }

    public void calculos() {
        String o;
        int k = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                d.display("El numero es: " + datos[i][j] + "\n");
                aritmetica();
                char op = a.charAt(0);
                operadores[k] = op;
                k++;
                switch (op) {
                    case '+':
                        totales[i][j] = datos[i][j] + escalar;
                        break;
                    case '-':
                        totales[i][j] = datos[i][j] - escalar;
                        break;
                    case '/':
                        totales[i][j] = datos[i][j] / escalar;
                        break;
                    case '*':
                        totales[i][j] = datos[i][j] * escalar;
                        break;
                }
            }
        }
    }

    public void resultados() {
        Pizarra p = new Pizarra();
        int k = 0;
        p.setVisible(true);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                p.out("El valor en la posicion " + (i + 1) + ", " + (j + 1) + " es: " + datos[i][j] + "\n"
                        + "se hizo la operacion " + operadores[k] + "\n"
                        + "con el escalar " + escalar + " el resultado fue " + totales[i][j] + "\n");
                k++;
            }
        }
    }

    public static void main(String[] args) {
        MatrizPorEscalar matrix = new MatrizPorEscalar();

        matrix.inicio();
        matrix.tamaño();
        matrix.datos();
        matrix.calculos();
        matrix.resultados();
    }
}
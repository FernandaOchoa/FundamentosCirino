package com.fernandaochoa.programas;

import cstio.Dialog;
import cstio.Pizarra;

import java.io.IOException;

/*Jardinero.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Días y horario del curso
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #:46
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

public class Jardinero {
    Pizarra p = new Pizarra();
    int array[] = new int[50];
    int area, max, valor = 0;

    public void inicio() {
        System.out.println("Para calcular el area");
    }

    public void datos() {
        p.out("No hay datosLados, son por default");
    }

    public void calculos() {
        p.out("No hay resultadosLados");
    }

    void resultados() {
        p.setVisible(true);

        for (int i = 0; i < array.length; i++) {
            valor = valor + 1;
            array[i] = (int) valor;
            area = i * (100 - (2 * i));
            p.out("Tabla " + i + " ");
            p.out("El area es " + area + "\n");
        }
        p.ofoto("jardinero.jpg");
    }

    public static void main(String[] args) throws IOException {
        Jardinero jardinero = new Jardinero();
        String resp = "s";

        jardinero.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            jardinero.datos();
            jardinero.calculos();
            jardinero.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea verlo otra vez? s/n");
            System.in.skip(2);
        }
    }
}
package com.fernandaochoa.arreglosOperaciones;

import cstio.Dialog;
import cstio.Pizarra;
import java.io.IOException;
import java.util.Scanner;

/*SumaDosArreglos.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #: 68
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

public class SumaDosArreglos {
    int v1, v2, v3, i3;
    int[] vec3;

    Scanner leer = new Scanner(System.in);

    public void inicio() {
        System.out.println("Programa para calcular la suma de dos arreglos");
    }

    public void datos() {
        System.out.print("Ingrese tamaño del vector 1:");
        v1 = leer.nextInt();
        System.out.print("\nIngrese tamaño del vector 2:");
        v2 = leer.nextInt();
    }

    void calculos() {

        int vec1[] = new int[v1];
        for (int i1 = 0; i1 < vec1.length; i1++) {
            System.out.print("\nIngrese Numero Entero de la Posicion" + " " + i1 + ":");
            vec1[i1] = leer.nextInt();
        }

        int vec2[] = new int[v2];
        for (int i2 = 0; i2 < vec2.length; i2++) {
            System.out.print("\nIngrese Numero Entero de la Posicion" + " " + i2 + ":");
            vec2[i2] = leer.nextInt();
        }
        v3 = v1;
        if (v2 > v1) {
            v3 = v2;
        }

        int[] vec3 = new int[v3];
        for (i3 = 0; i3 < vec3.length; i3++) {
            int valv1 = 0;
            if (vec1.length > i3) {
                valv1 = vec1[i3];
            }
            int valv2 = 0;
            if (vec2.length > i3) {
                valv2 = vec2[i3];
            }
            vec3[i3] = valv1 + valv2;
        }
    }

    public void resultados() {
        System.out.println("\nLa Suma de la Posicion" + " " + i3 + " " + "es:" + vec3[i3]);
    }

    public static void main(String[] args) throws IOException {
        SumaDosArreglos suma = new SumaDosArreglos();
        String resp = "s";
        Pizarra p = new Pizarra();
        Dialog d = new Dialog();

        suma.inicio();

        while (resp == "s") {
            suma.datos();
            suma.calculos();
            suma.resultados();
            resp = d.readString("¿Desea calcular otro sueldo? s/n");
            if (resp.equals("n") || resp.equals("N")) {
                System.exit(0);
            }
            System.in.skip(2);
        }
    }
}
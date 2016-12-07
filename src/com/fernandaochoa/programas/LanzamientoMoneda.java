package com.fernandaochoa.programas;

import cstio.Dialog;
import cstio.Pizarra;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by monsh on 06/12/2016.
 */
public class LanzamientoMoneda {
    public static void main(String[] args) throws IOException {

        LanzamientoMoneda lanzamientoMoneda = new LanzamientoMoneda();

        Pizarra p = new Pizarra();
        Dialog d = new Dialog();
        String resp = "s";

        lanzamientoMoneda.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            lanzamientoMoneda.calculos();
            resp = d.readString("¿Desea simular otro lanzamiento? s/n");
            if (resp.equals("n") || resp.equals("N")) {
                System.exit(0);
            }
            System.in.skip(2);
        }


    }

    public void inicio() {
        System.out.println("Programa para simular el lanzamiento de una moneda");
    }


    Random generator = new Random();

    double lanzamientos = 0;
    double favorables = 0;

    public void calculos() {
        int t = datos();
        //0 = aguila, 1 es sol
        int b = 1;
        boolean verLanzamientos = true;
        String[] aguilaosol = {"Aguila", "Sol"};
        System.out.println("Simulando " + t + " lanzamientos de moneda...");
        System.out.print("El programa cuenta el número de '");
        System.out.println(aguilaosol[b] + "' que salen...");

        for (int i = 0; i < (t / 10); i++) {
            for (int j = 0; j < 10; j++) {

                int r = generator.nextInt(2);
                if (r == b) {
                    // si el lanzamiento es el resultado que esperábamos,
                    // lo mostramos y señalamos entre paréntesis
                    favorables++;
                    if (verLanzamientos)
                        System.out.print("(" + aguilaosol[r] + ") ");
                } else {
                    // si no, simplemente lo mostramos
                    if (verLanzamientos)
                        System.out.print(" " + aguilaosol[r] + "  ");
                }
            }
            // nuevo bloque de 10 lanzamientos...
            lanzamientos += 10;

            // mostramos la frecuencia relativa hasta el momento
            if (verLanzamientos) {
                verLanzamiento(i, favorables, lanzamientos);
            }
            // la frecuencia relativa hasta el último lanzamiento
            // siempre se muestra
            if (i == ((t / 10) - 1)) {
                verLanzamiento(i, favorables, lanzamientos);
            }

        }
    }

    public static int datos() {
        System.out.println("Escribe la cantidad de lanzamientos a calcular (Min 10 para obtener Frec Relativa)");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    // Se muestran los detalles del lanzamiento y la frecuencia relativa
    public static void verLanzamiento(int i, double favorables, double lanzamientos) {
        // calculamos la frecuencia relativa
        double fr = favorables / lanzamientos;
        System.out.print("\t" + (int) favorables + "/" + (int) lanzamientos);
        System.out.println("\t= " + fr + "\t ");

    }

}


package com.fernandaochoa.programas;

import cstio.Dialog;
import cstio.Pizarra;

import java.io.IOException;
import java.util.Scanner;

public class CribaEratostenes {
    Pizarra p = new Pizarra();
    Dialog d = new Dialog();
    public static int n;

    public void inicio() {
        System.out.println("Programa para desplegar la calculos de Eratostenes segun un numero dado");
    }

    public void calculos(int tamanoArreglo) {

        boolean arreglo[] = new boolean[tamanoArreglo + 1];
        for (int i = 1; i < tamanoArreglo; i++)
            arreglo[i] = true;

        for (int j = 2; j <= tamanoArreglo; j++)
            if (true == arreglo[j])
                for (int k = 2; k <= (tamanoArreglo) / j; k++)
                    arreglo[k * j] = false;

        resultados(arreglo, tamanoArreglo);
    }


    public void resultados(boolean a[], int tamano) {
        int count = 0;

        for (int i = 2; i <= tamano; i++) {
            if (true == a[i])
                count++;
        }

        System.out.printf("Los %d numeros que hay en la calculos son: ", count);
        System.out.printf("entre 1 y %d\n\n", n);

        int i = 1;
        for (int n = 1; n <= tamano; n++) {

            if (true == a[n]) {
                System.out.printf("%4d\t", n);
                i++;
            }
            if (10 == i) {
                System.out.println();
                i = 1;
            }
        }
        System.out.printf("\n");
    }

    public static void main(String[] args) throws IOException {
        CribaEratostenes cribaEratostenes = new CribaEratostenes();
        String resp = "s";
        Dialog d = new Dialog();


        cribaEratostenes.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            cribaEratostenes.datos();
            cribaEratostenes.calculos(n);
            resp = d.readString("¿Desea calcular la criba de otro numero? s/n");
            if (resp.equals("n") || resp.equals("N")) {
                System.exit(0);
            }
            System.in.skip(2);
        }
    }
    public  void datos() {
        System.out.println("Escribe un numero natural para calcular su criba ");

        Scanner num = new Scanner(System.in);
        n = num.nextInt();
    }


}

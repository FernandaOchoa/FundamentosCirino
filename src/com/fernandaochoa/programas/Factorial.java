package com.fernandaochoa.programas;

import cstio.Dialog;

import java.io.IOException;
import java.util.Scanner;

/*Factorial.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Días y horario del curso
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio: #43
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/
public class Factorial {

    public static void resultados(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d! = %d\n", i, factorial(i));
        }
    }

    public static int factorial(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static int datos() {
        System.out.println("Escribe un numero a calcular");
        Scanner n = new Scanner(System.in);
        return n.nextInt();
    }

    public static void inicio() {
        System.out.println("Calcular el factorial de un numero segun un numero dado");
    }

    public static void main(String[] args) throws IOException {
        String resp = "s";
        Dialog d = new Dialog();

        inicio();
        while (resp.equals("s") || resp.equals("S")) {
            int num = datos();
            factorial(num);
            resultados(num);
            resp = d.readString("¿Desea calcular el factorial de otro numero? s/n");
            if (resp.equals("n") || resp.equals("N")) {
                System.exit(0);
            }
            System.in.skip(2);
        }
    }
}
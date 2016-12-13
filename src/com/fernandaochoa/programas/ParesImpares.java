package com.fernandaochoa.programas;

import cstio.Dialog;
import cstio.Pizarra;

import java.io.IOException;

/*ParesImpares.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Días y horario del curso
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio: #42
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

public class ParesImpares {
    Pizarra p = new Pizarra();
    Dialog d = new Dialog();
    int n;
    String num;

    //Validacion de numeros por teclado
    boolean isNum(String cad) {
        Dialog d = new Dialog();
        try {
            Double.parseDouble(cad);
            return true;
        } catch (NumberFormatException nfe) {
            d.display("solo se admiten valores numericos");
        }
        return false;
    }

    public void inicio() {
        System.out.println("Programa para calcular suma de los pares impares");
    }

    public void datos() {
        p.setVisible(true);
        do num = d.readString("Ingrese el valor del n:");
        while (!isNum(num));
        n = Integer.parseInt(num);
    }

    public void calculos() {
        p.out("No hay resultadosLados");
    }

    public void resultados() {
        int sumaImpar = 0;
        int sumaPar = 0;
        int x = 0;

        if (n % 2 == 0) {
            p.out("\nEl numero es par \n");
            for (int i = 0; i <= n; i = i + 2) {
                x = x + i;
            }
            p.out("\nLa suma de los numeros naturales pares hasta " + n + " es " + x);
        } else {
            p.out("\nEl numero es impar");
            for (int i = 1; i <= n; i = i + 2) {
                x = x + i;
            }
            p.out("\nLa suma de los numeros impares hasta " + n + " es " + x);
        }
    }

    public static void main(String[] args) throws IOException {
        ParesImpares paresImpares = new ParesImpares();
        Pizarra p = new Pizarra();
        Dialog d = new Dialog();
        String resp = "s";

        paresImpares.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            paresImpares.datos();
            paresImpares.calculos();
            paresImpares.resultados();
            resp = d.readString("¿Desea calcular otro numero? s/n");
            if (resp.equals("n") || resp.equals("N")) {
                System.exit(0);
            }
            System.in.skip(2);
        }
    }
}
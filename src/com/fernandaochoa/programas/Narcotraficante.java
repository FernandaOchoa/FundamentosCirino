package com.fernandaochoa.programas;

import cstio.Dialog;
import cstio.Pizarra;

import java.io.IOException;

/*Narcotraficante.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Días y horario del curso
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #:40
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

public class Narcotraficante {
    Pizarra p = new Pizarra();
    int a, b, c, a1, a2, a3, b1, b2, b3, c1, c2, c3;

    public void inicio() {
        System.out.println("Para calcular la pelota con droga en una caja de 9 pelotas");
    }

    public void datos() {
        a1 = 1;
        a2 = 1;
        a3 = 1;
        b1 = 1;
        b2 = 1;
        b3 = 1;
        c1 = 1;
        c2 = 2;
        c3 = 1;
    }

    public void calculos() {
        //separamos en 3 grupos
        a = a1 + a2 + a3;
        b = b1 + b2 + b3;
        c = c1 + c2 + c3;
    }

    void resultados() { //No. 3 Imprimir
        p.setVisible(true);
        if (a > b) {
            if (a1 > a2)
                p.out("La pelota con droga es a1\n");
            else if (a1 < a2)
                p.out("La pelota con droga es a2\n");
            else if (a1 == a2)
                p.out("La pelota con droga es a3\n");
        } else if (a < b) {
            if (b1 > b2)
                p.out("La pelota con droga es b1\n");
            else if (b1 < b2)
                p.out("La pelota con droga es b2\n");
            else if (b1 == b2)
                p.out("La pelota con droga es b3\n");
        } else if (a == b) {
            if (c1 > c2)
                p.out("La pelota con droga es c1\n");
            else if (c1 < c2)
                p.out("La pelota con droga es c2\n");
            else if (c1 == c2)
                p.out("La pelota con droga es c3\n");
        }
        p.ofoto("pelota.jpg");
    }

    public static void main(String[] args) throws IOException {
        Narcotraficante narcotraficante = new Narcotraficante();
        String resp = "s";

        narcotraficante.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            narcotraficante.datos();
            narcotraficante.calculos();
            narcotraficante.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea calcular otra caja de pelotas? s/n");
            System.in.skip(2);
        }
    }
}
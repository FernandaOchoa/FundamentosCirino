package com.fernandaochoa.programas;

import com.fernandaochoa.capsulas.Rehilete;
import cstio.Dialog;
import cstio.Pizarra;

import java.io.IOException;

/*Rehilete.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Días y horario del curso
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #: 53
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

public class RehileteP {

    Rehilete rehilete = new Rehilete();
    Pizarra p = new Pizarra();
    int nu;

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

    public void datos(Rehilete rehilete) {
        Dialog d = new Dialog();
        String aux;
        System.out.println("Este Programa Crea Un Rehilete de numeros");

        do aux = d.readString("Ingrese el tamaño del rehilete:");
        while (!isNum(aux));
        rehilete.setN((Integer.parseInt(aux)));
    }

    public void dibujo() {

        nu = (int) rehilete.getN();
        boolean bandera = false, bandera2 = false;
        for (int i = 0; i < nu + 1; i++) {
            for (int j = 0; j < i; j++) {
                p.out(String.valueOf(i));
                bandera = true;
            }
            if (bandera == true) {
                for (int j = nu; j > i - 1; j--) {
                    p.out(" ");
                    bandera2 = true;
                }
            }
            if (bandera2 == true) {
                for (int j = nu; j > i - 1; j--) {
                    p.out(String.valueOf(i));
                }
            }
            p.out("\n");

            for (int k = nu; k > i; k--) {
                p.out(" ");
            }
            for (int l = -1; l < i; l++) {
                p.out(" ");
            }
        }
    }

    public void dibujoAbajo() {
        p.out("\n");
        for (int i = 0; i < nu; i++) {
            for (int j = -1; j < i; j++) {
                p.out(" ");
            }
            for (int k = nu; k > i; k--) {
                p.out(" ");
            }
            for (int l = nu; l > i; l--) {
                p.out(" ");
            }
            for (int m = -1; m < i; m++) {
                p.out(String.valueOf(i));
            }
            for (int n = -1; n < i; n++) {
                p.out(" ");
            }
            for (int o = nu; o > i; o--) {
                p.out(String.valueOf(i));
            }
            p.out("\n");
        }
        p.setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        RehileteP rehileteP = new RehileteP();
        String resp = "s";

        while (resp.equals("s") || resp.equals("S")) {
            rehileteP.datos(rehileteP.rehilete);
            rehileteP.dibujo();
            rehileteP.dibujoAbajo();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea ver otro rehilete? s/n");
            System.in.skip(2);
        }
    }
}
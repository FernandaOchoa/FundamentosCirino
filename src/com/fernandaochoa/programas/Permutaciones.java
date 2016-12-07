package com.fernandaochoa.programas;

import com.fernandaochoa.capsulas.Combinaciones;
import cstio.Dialog;
import cstio.Pizarra;

import java.io.IOException;

/*NombreDelArchivo.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Días y horario del curso
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Tarea #: _______
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

public class Permutaciones {
    Combinaciones combinaciones = new Combinaciones();

    Pizarra p = new Pizarra();

    public void inicio() {
        System.out.println("Para calcular las permutaciones");
    }

    int cosas, posibles, nf, nkf, resultado;

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

    public void datos(Combinaciones c) {
        Dialog d = new Dialog();
        String aux;


        do aux = d.readString("Ingrese el numero de objetos que puedes elegir:");
        while (!isNum(aux));
        c.setCosas((Integer.parseInt(aux)));

        do aux = d.readString("Ingrese la cantidad que puedes elegir:");
        while (!isNum(aux));
        c.setPosibles((Integer.parseInt(aux)));

    }

    public static int factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    public void calculos() {

        cosas = (int) combinaciones.getCosas();
        posibles = (int) combinaciones.getPosibles();

        nf = factorial(cosas);
        nkf = factorial(cosas - posibles);
        resultado = nf / nkf;
    }

    void resultados() {

        p.setVisible(true);
        p.out("\nExisten un numero de \n");
        p.out(+resultado + " Permutaciones posibles \n");
        p.ofoto("permutaciones.jpg");
    }

    public static void main(String[] args) throws IOException {
        Permutaciones a = new Permutaciones();
        String resp = "s";

        a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos(a.combinaciones);
            a.calculos();
            a.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea calcular otra permutacion? s/n");
            System.in.skip(2);
        }
    }

}

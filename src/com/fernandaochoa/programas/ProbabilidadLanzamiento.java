package com.fernandaochoa.programas;

import cstio.Dialog;
import cstio.Pizarra;
import java.io.IOException;
import static java.lang.Math.pow;

/*PosibilidadLanzamiento.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Días y horario del curso
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #:51
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/
public class ProbabilidadLanzamiento {
    Pizarra p = new Pizarra();
    int[] monedas = {1, 2, 3, 4, 5};
    int[] aguila = {0, 1, 2, 3, 4, 5};

    double valor, promedio;

    public void inicio() {
        System.out.println("Para calcular la probabiliad al lanzar una moneda");
    }

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

    void resultados() {
        p.setVisible(true);
        for (int y = 0; y <= aguila.length; y++) {
            for (int i = 1; i <= monedas.length; i++) {
                if (valor == 0)
                    valor = 1;
                if (y > i) {
                    valor = 1000000000;
                }
                promedio = i / pow(2, valor);
                valor = y;
                p.out("Al lanzar " + i + " ");
                p.out("monedas la probabilidad de obtener " + y + " ");
                p.out("aguilas es " + promedio + "\n");
            }
        }
        p.ofoto("moned.jpg");
    }

    public static void main(String[] args) throws IOException {
        ProbabilidadLanzamiento probabilidadLanzamiento = new ProbabilidadLanzamiento();
        String resp = "s";

        probabilidadLanzamiento.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            probabilidadLanzamiento.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea calcular otro lanzamiento? s/n");
            System.in.skip(2);
        }
    }
}
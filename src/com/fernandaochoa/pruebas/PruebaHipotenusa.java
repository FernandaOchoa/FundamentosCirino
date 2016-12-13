package com.fernandaochoa.pruebas;

import com.fernandaochoa.capsulas.Hipotenusa;
import cstio.Dialog;
import cstio.Pizarra;

import java.io.IOException;

/*PruebaHipotenusa.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #: 25
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/
public class PruebaHipotenusa {
    Hipotenusa hipotenusa = new Hipotenusa();
    Pizarra p = new Pizarra();
    Dialog d = new Dialog();

    float co, ca;
    double h;
    String op, ad;

    //Meta
    public void inicio() {
        System.out.println("Programa para calcular el valor de la hipotenusa");
    }

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

    void datos(Hipotenusa hipotenusa) {

        p.setVisible(true);
        do ad = d.readString("Ingrese el valor del cateto adyacente:");
        while (!isNum(ad));
        ca = Integer.parseInt(ad);
        hipotenusa.setAdyacente(ca);

        p.setVisible(true);
        do op = d.readString("Ingrese el valor del cateto opuesto:");
        while (!isNum(op));
        co = Integer.parseInt(op);
        hipotenusa.setOpuesto(co);

    }

    void calculos() {
        ca = hipotenusa.getAdyacente() * hipotenusa.getAdyacente();
        co = hipotenusa.getOpuesto() * hipotenusa.getOpuesto();
        h = Math.sqrt(ca + co);
    }

    void resultados() {
        p.out("El valor de la hipotenusa es: " + h+"\n");
        p.ofoto("teorema.jpg");
    }

    public static void main(String[] args) throws IOException {
        PruebaHipotenusa ph = new PruebaHipotenusa();
        Pizarra p = new Pizarra();
        Dialog d = new Dialog();
        String resp = "s";

        ph.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            ph.datos(ph.hipotenusa);
            ph.calculos();
            ph.resultados();
            resp = d.readString("¿Desea calcular otra hipotenusa? s/n");
            if (resp.equals("n") || resp.equals("N"))
                System.exit(0);
            System.in.skip(2);
        }
    }
}
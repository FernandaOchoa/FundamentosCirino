package com.fernandaochoa.programas;

import com.fernandaochoa.capsulas.Monstruo;
import cstio.Dialog;
import cstio.Pizarra;

import java.io.IOException;
import java.util.Scanner;

/*PruebaMonstruo.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Días y horario del curso
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Tarea #: 5
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/
public class PruebaMonstruo {

    Scanner teclado = new Scanner(System.in);
    Monstruo m = new Monstruo();

    void inicio() {
        System.out.println("Para observar las propiedades del monstruo  ");
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

    void datos(Monstruo m) {
        Pizarra x = new Pizarra();
        Dialog d = new Dialog();
        String v;
        int numero;

        x.setVisible(true);

        do v = d.readString("Ingrese el Color del monstruo:");
        while (v.isEmpty());
        m.setColor(v);

        do v = d.readString("Ingrese la cantidad de Ojos que tiene el monstruo:");
        while (!isNum(v));
        numero = Integer.parseInt(v);
        m.setOjos(numero);

        do v = d.readString("Ingrese la cantidad de Brazos que tiene el monstruo:");
        while (!isNum(v));
        numero = Integer.parseInt(v);
        m.setBrazos(numero);

        do v = d.readString("Ingrese la cantidad de Piernas que tiene el monstruo:");
        while (!isNum(v));
        numero = Integer.parseInt(v);
        m.setPiernas(numero);

        do v = d.readString("Ingrese el tamaño que tiene el monstruo:");
        while (!isNum(v));
        numero = Integer.parseInt(v);
        m.setTamaño(numero);

    }

    void resultados() {
        Pizarra p = new Pizarra();
        p.out("Programa para modelar un monstruo\n");
        p.setVisible(true);
        p.out("\nSu monstruo es asi:\n" + m.printStates());
        p.out("\n");
        p.ofoto("monstruo.jpg");
    }

    public static void main(String[] args) throws IOException {
        PruebaMonstruo monstruo = new PruebaMonstruo();
        int resp = 'S';

        monstruo.inicio();
        while (resp == 's' || resp == 'S') {
            monstruo.datos(monstruo.m);
            monstruo.resultados();
            System.out.print("¿Ver otra vez el monstruo? s/n");
            resp = System.in.read();
            System.in.skip(2);
        }
    }
}
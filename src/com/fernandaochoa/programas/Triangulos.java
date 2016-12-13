package com.fernandaochoa.programas;

import cstio.Dialog;
import cstio.Pizarra;

import java.io.IOException;

/*Triangulos.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Días y horario del curso
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio: #37
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

public class Triangulos {
    Pizarra p = new Pizarra();
    Dialog d = new Dialog();

    int l1, l2, l3, an1, an2, an3;
    String a1, a2, a3, ag1, ag2, ag3;

    //Validacion de numeros por teclado
    boolean isNum(String cad) {
        Dialog d = new Dialog();
        try {
            Double.parseDouble(cad);
            return true;
        } catch (NumberFormatException nfe) {
            d.display("Solo se admiten valores numericos");
        }
        return false;
    }

    public void inicio() {
        System.out.println("Programa para calcular 3 valores y");
        System.out.print(" clasificar un triangulo por sus lados");
        System.out.print(" o por sus angulos");
    }

    public void datosLados() {
        p.setVisible(true);
        do a1 = d.readString("Ingrese el valor del lado 1:");
        while (!isNum(a1));
        l1 = Integer.parseInt(a1);

        p.setVisible(true);
        do a2 = d.readString("Ingrese el valor del lado 2:");
        while (!isNum(a2));
        l2 = Integer.parseInt(a2);

        p.setVisible(true);
        do a3 = d.readString("Ingrese el valor del lado 3:");
        while (!isNum(a3));
        l3 = Integer.parseInt(a3);
    }

    public void datosAngulos() {
        p.setVisible(true);
        do ag1 = d.readString("Ingrese el valor del angulo 1:");
        while (!isNum(ag1));
        an1 = Integer.parseInt(ag1);

        p.setVisible(true);
        do ag2 = d.readString("Ingrese el valor del angulo 2:");
        while (!isNum(ag2));
        an2 = Integer.parseInt(ag2);

        p.setVisible(true);
        do ag3 = d.readString("Ingrese el valor del angulo 3:");
        while (!isNum(ag3));
        an3 = Integer.parseInt(ag3);
    }

    public void resultadosLados() {
        if ((l1 == l2) && (l2 == l3)) {
            p.out("El triangulo es equilatero");
            p.ofoto("triangulos.jpg");
        } else if ((l1 == l2) || (l1 == l3) || (l2 == l3)) {
            p.out("El triangulo es isoceles");
            p.ofoto("triangulos.jpg");
        } else if ((l1 != l2) || (l1 != l3) || (l3 != l2)) {
            p.out("El triangulo es escaleno");
            p.ofoto("triangulos.jpg");
        }
    }

    public void resultadosAngulos() {
        if ((an1 > 90) && (an2 > 90) && (an3 > 90)) {
            p.out("Triangulo Acutangulo");
            p.ofoto("triangulos.jpg");
        } else if ((an1 == 90) || (an2 == 90) || (an3 == 90)) {
            p.out("Triangulo Rectangulo");
            p.ofoto("triangulos.jpg");
        } else if ((an3 > 90) || (an2 > 90) || (an1 > 90)) {
            p.out("Triangulo Obtusangulo");
            p.ofoto("triangulos.jpg");
        }
    }

    public static void main(String[] args) throws IOException {
        Pizarra p = new Pizarra();
        Dialog d = new Dialog();
        Triangulos triangulos = new Triangulos();
        menu(d, triangulos);
    }

    public static void menu(Dialog d, Triangulos triangulos) throws IOException {
        String opc;
        int op;

        opc = d.readString("Selecciona la opcion para clasificar \n" +
                "1) Por sus lados\n" +
                "2) Por sus angulos");
        op = Integer.parseInt(opc);

        switch (op) {
            case 1:
                triangulos.lados();
                break;
            case 2:
                triangulos.angulos();
                break;
        }
    }

    public void lados() throws IOException {
        Pizarra p = new Pizarra();
        Dialog d = new Dialog();
        String resp = "s";
        Triangulos triangulos = new Triangulos();

        triangulos.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            triangulos.datosLados();
            triangulos.resultadosLados();
            resp = d.readString("¿Desea calcular otro triangulo? s/n");
            menu(d, triangulos);
            if (resp.equals("n") || resp.equals("N")) {
                System.exit(0);
            }
            System.in.skip(2);
        }
    }

    public void angulos() throws IOException {
        Pizarra p = new Pizarra();
        Dialog d = new Dialog();
        String resp = "s";
        Triangulos triangulos = new Triangulos();

        triangulos.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            triangulos.datosAngulos();
            triangulos.resultadosAngulos();
            resp = d.readString("¿Desea calcular otro triangulo? s/n");
            menu(d, triangulos);
            if (resp.equals("n") || resp.equals("N")) {
                System.exit(0);
            }
            System.in.skip(2);
        }
    }
}

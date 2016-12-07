package com.fernandaochoa.programas;

import cstio.Dialog;
import cstio.Pizarra;

import java.io.IOException;

/**
 * Created by monsh on 05/12/2016.
 */
public class Triangulos {
    Pizarra p = new Pizarra();
    Dialog d = new Dialog();

    int l1, l2, l3;
    String a1, a2, a3;

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
        System.out.println("Programa para calcular 3 valores y clasificar un triangulo por sus lados");
    }

    public void datos() {

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

    public void calculos() {
        p.out("No hay calculos \n");
    }

    public void resultados() {
        if ((l1 == l2) && (l2 == l3)) {
            p.out("El triangulo es equilatero");
        } else if ((l1 == l2) || (l1 == l3) || (l2 == l3)) {
            p.out("El triangulo es isoceles");
        } else if ((l1 != l2) || (l1 != l3) || (l3 != l2)) {
            p.out("El triangulo es escaleno");
        }
    }

    public static void main(String[] args) throws IOException {
        Triangulos triangulos = new Triangulos();

        Pizarra p = new Pizarra();
        Dialog d = new Dialog();
        String resp = "s";

        triangulos.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            triangulos.datos();
            triangulos.calculos();
            triangulos.resultados();
            resp = d.readString("¿Desea calcular otro triangulo? s/n");
            if (resp.equals("n") || resp.equals("N")) {
                System.exit(0);
            }
            System.in.skip(2);
        }

    }
}

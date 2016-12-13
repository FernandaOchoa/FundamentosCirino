package com.fernandaochoa.pruebas;

import com.fernandaochoa.capsulas.FormulaGeneral;
import cstio.Dialog;
import cstio.Pizarra;

import java.io.IOException;

/*PruebaFormulaGeneral.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #: 34
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/
public class PruebaFormulaGeneral {
    FormulaGeneral formulaGeneral = new FormulaGeneral();
    Pizarra p = new Pizarra();
    Dialog d = new Dialog();
    int a, b, c;
    String a1, b2, c3;
    double determinante, x1, x2;

    //Meta
    public void inicio() {
        System.out.println("Programa para calcular la Formula General");
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
    //Datos
    void datos(FormulaGeneral formulaGeneral) {

        p.setVisible(true);
        do a1 = d.readString("Ingrese el valor de a:");
        while (!isNum(a1));
        a = Integer.parseInt(a1);
        formulaGeneral.setA(a);

        p.setVisible(true);
        do b2 = d.readString("Ingrese el valor de b:");
        while (!isNum(b2));
        b = Integer.parseInt(b2);
        formulaGeneral.setB(b);

        p.setVisible(true);
        do c3 = d.readString("Ingrese el valor de c:");
        while (!isNum(c3));
        c = Integer.parseInt(c3);
        formulaGeneral.setC(c);
    }

    //Calculos
    void calculos() {
        determinante = b * b - 4.0 * a * c;

        if (determinante < 0) {
            System.out.println("soluciones imaginarias");
            determinante = -determinante;
        } else
            System.out.println("soluciones reales");
            x1 = (-b + Math.sqrt(determinante)) / 2.0 / a;
            x2 = (-b - Math.sqrt(determinante)) / 2.0 / a;
            System.out.println("Valor de discriminante: " + determinante);
            System.out.println("Valor de x1: " + x1);
            System.out.println("Valor de x2: " + x2);
    }

    //Resultados
    void resultados() {
        p.out("La solucion para x1 es: " + x1 + "\n");
        p.out("La solucion para x2 es: " + x2 + "\n");
        p.ofoto("general.jpg");
    }

    //Navegacion
    public static void main(String[] args) throws IOException {
        PruebaFormulaGeneral pfg = new PruebaFormulaGeneral();
        Pizarra p = new Pizarra();
        Dialog d = new Dialog();
        String resp = "s";

        pfg.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            pfg.datos(pfg.formulaGeneral);
            pfg.calculos();
            pfg.resultados();
            resp = d.readString("¿Desea calcular otra ecuacion cuadratica? s/n");
            if (resp.equals("n") || resp.equals("N")) {
                System.exit(0);
            }
            System.in.skip(2);
        }
    }
}
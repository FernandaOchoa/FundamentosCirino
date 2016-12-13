package com.fernandaochoa.programas;

import cstio.Dialog;
import cstio.Pizarra;

import java.io.IOException;

/*TablasDeMultiplicar.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Días y horario del curso
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio: #50
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/
public class TablasDeMultiplicar {
    Pizarra p = new Pizarra();
    Dialog d = new Dialog();

    public void inicio() {
        System.out.println("Algoritmo para desplegar las tablas de multiplicar del 1 al 15");
    }

    public void datos() {
        p.setVisible(true);
        p.out("El dato a calcular es 15 por default");
    }
    public void calculos(){
        p.out("\nNo hay resultadosLados");
    }

    public void resultados() {
        unoAlTres();
        pausa();
        cuatroAlSeis();
        pausa();
        sieteAlNueve();
        pausa();
        diezAlDoce();
        pausa();
        treceAlQuince();
    }

    public void pausa(){
        try {
            Thread.sleep(1500);
        }catch (InterruptedException ie){
            System.out.println("Ah ocurrido una interrupcion");
        }
    }

    public void treceAlQuince() {
        p.setVisible(true);
        for (int j = 13; j <= 15; j++) {
            p.out("Tabla del " + j+"\n");
            for (int i = 1; i <= 10; i++)
                p.out(j + " * " + i + " = " + j * i+"\n");
            p.out("\n");
        }
    }

    public void diezAlDoce() {
        p.setVisible(true);
        for (int j = 10; j <= 12; j++) {
            p.out("Tabla del " + j+"\n");
            for (int i = 1; i <= 10; i++)
                p.out(j + " * " + i + " = " + j * i+"\n");
            p.out("\n");
        }
    }

    public void sieteAlNueve() {
        p.setVisible(true);
        for (int j = 7; j <= 9; j++) {
            p.out("Tabla del " + j+"\n");
            for (int i = 1; i <= 10; i++)
                p.out(j + " * " + i + " = " + j * i+"\n");
            p.out("\n");
        }
    }

    public void cuatroAlSeis() {
        p.setVisible(true);
        for (int j = 4; j <= 6; j++) {
            p.out("Tabla del " + j+"\n");
            for (int i = 1; i <= 10; i++)
                p.out(j + " * " + i + " = " + j * i+"\n");
            p.out("\n");
        }
    }

    public void unoAlTres() {
        p.setVisible(true);
        for (int j = 1; j <= 3; j++) {
            p.out("Tabla del " + j+"\n");
            for (int i = 1; i <= 10; i++)
                p.out(j + " * " + i + " = " + j * i+"\n");
            p.out("\n");
        }
    }

    public static void main(String[] args) throws IOException{
        Pizarra p = new Pizarra();
        Dialog d = new Dialog();
        String resp = "s";

        TablasDeMultiplicar tablasDeMultiplicar = new TablasDeMultiplicar();
        tablasDeMultiplicar.resultados();

        tablasDeMultiplicar.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            tablasDeMultiplicar.datos();
            tablasDeMultiplicar.calculos();
            tablasDeMultiplicar.resultados();
            resp = d.readString("¿Desea verlo nuevamente? s/n");
            if (resp.equals("n") || resp.equals("N")) {
                System.exit(0);
            }
            System.in.skip(2);
        }
    }
}
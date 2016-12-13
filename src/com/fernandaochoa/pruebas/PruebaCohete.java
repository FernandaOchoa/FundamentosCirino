package com.fernandaochoa.pruebas;

import com.fernandaochoa.capsulas.Cohete;
import cstio.Dialog;
import cstio.Pizarra;

import java.io.IOException;

/*PruebaCohete.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #: 29
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/
public class PruebaCohete {
    //Instancia de mi pojo
    Cohete cohete = new Cohete();
    int hora, segundo, minuto, tiempo, dia;

    //Meta
    public void inicio() {
        System.out.println("Programa Cohete");
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
    public void datos(Cohete cohete) {
        //Preparamos interfaz y variables
        Pizarra x = new Pizarra();
        Dialog d = new Dialog();
        String v;
        int hora, segundo, minuto, tiempo;

        //Ingresamos la hora y la asignamos
        do v = d.readString("Ingrese la hora en la que el cohete se fue:");
        while (!isNum(v));
        hora = Integer.parseInt(v);
        cohete.setHora(hora);
        this.hora = hora;

        //Ingresamos los minutos y los asignamos
        do v = d.readString("Ingrese los minutos en los que el cohete se fue:");
        while (!isNum(v));
        minuto = Integer.parseInt(v);
        cohete.setMinuto(minuto);
        this.minuto = minuto;

        //Ingresamos los segundos y la asignamos
        do v = d.readString("Ingrese los segundos en los que que el cohete se fue:");
        while (!isNum(v));
        segundo = Integer.parseInt(v);
        cohete.setSegundo(segundo);
        this.segundo = segundo;

        //Ingresamos la hora y la asignamos
        do v = d.readString("Ingrese los segundos de vuelos:");
        while (!isNum(v));
        tiempo = Integer.parseInt(v);
        cohete.setTiempo(tiempo);
        this.tiempo = tiempo;
    }

    // Calculos de el programa
    void Calculos() {
        dia = tiempo / 86400;
        hora = (tiempo - (86400 * dia)) / 60;
        minuto = (tiempo - (3600 * hora)) / 60;
        segundo = tiempo - (((hora * 3600) + (minuto * 60))/60);
    }

    // Resultados
    void resultados() {
        Pizarra p = new Pizarra();
        p.out("Programa del Cohete\n"); //change
       p.setVisible(true);

        p.out("El tiempo de vuelo fue \n" +
                "Dias: " + dia +
                "\nHoras: " + hora +
                "\nMinutos " + minuto +
                "\nSegundos " + segundo);
        p.out("\n");
        p.ofoto("cohete.jpg");
    }

    public static void main(String[] args) throws IOException {
        PruebaCohete c = new PruebaCohete();
        Pizarra p = new Pizarra();
        Dialog d = new Dialog();
        String resp = "s";

        c.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            c.datos(c.cohete);
            c.resultados();
            resp = d.readString("¿Desea ver otro vuelo? s/n");
            if (resp.equals("n") || resp.equals("N")) {
                System.exit(0);
            }
            System.in.skip(2);
        }
    }
}
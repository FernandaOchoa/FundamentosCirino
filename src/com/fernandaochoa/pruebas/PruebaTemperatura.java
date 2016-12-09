package com.fernandaochoa.pruebas;

import com.fernandaochoa.capsulas.Temperatura;
import com.sun.org.apache.bcel.internal.generic.SWITCH;
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
  Tarea #: ___6____
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/
public class PruebaTemperatura {

    Temperatura temperatura = new Temperatura();

    int opc;
    float celsius, fahrenheit, grados, Tfahrenheit, Tcelsius;

    Pizarra p = new Pizarra();
    Dialog d = new Dialog();

    //Inicio
    void inicio() {
        System.out.println("Programa de Conversion de Temperaturas");
    }

    //Datos
    void datos(Temperatura temperatura) {
        //Preparamos interfaz y variables
        String v;
        String resp = "s";
        resp = d.readString("Selecciona la unidad de conversion \n 1)Conversion de Celsius a Fahrenheit\n 2)Conversion de Fahrenheit a Celsius");
        opc = Integer.parseInt(resp);
    }

    //Calculos
    void calculos() {
        switch (opc) {
            case 1:
                String c;
                c = d.readString("Escribe los grados Celsius a convertir: ");
                celsius = Float.parseFloat(c);
                temperatura.setCelsius(celsius);
                Tfahrenheit = 1.8f * celsius + 32;
                break;
            case 2:
                String c2;
                c = d.readString("Escribe los grados Fahrenheit a convertir: ");
                fahrenheit = Float.parseFloat(c);
                temperatura.setFahrenheit(fahrenheit);
                Tcelsius = (fahrenheit - 32) / 1.8f;
                break;
        }
    }

    //Resultado
    void resultado() {
        if (opc == 1) {
            p.out("Los grados Celsius: " + temperatura.getCelsius() + " en Fahrenheit son: " + Tfahrenheit);
            p.out("\n");
            p.ofoto("fahrenheit.jpg");
            p.setVisible(true);
        } else {
            p.out("Los grados Fahrenheit " + temperatura.getFahrenheit() + " en Celsius son: " + Tcelsius);
            p.out("\n");
            p.ofoto("celsius.jpg");
            p.setVisible(true);
        }
    }

    public static void main(String[] args) throws IOException {

        PruebaTemperatura pt = new PruebaTemperatura();

        Pizarra p = new Pizarra();
        Dialog d = new Dialog();
        String resp = "s";

        pt.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            pt.datos(pt.temperatura);
            pt.calculos();
            pt.resultado();
            resp = d.readString("¿Desea calcular otra temperatura? s/n");
            if (resp.equals("n") || resp.equals("N")) {
                System.exit(0);
            }
            System.in.skip(2);
        }
    }
}


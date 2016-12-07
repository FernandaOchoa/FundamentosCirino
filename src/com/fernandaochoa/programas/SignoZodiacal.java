package com.fernandaochoa.programas;

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

public class SignoZodiacal {
    Pizarra p = new Pizarra();
    Dialog d = new Dialog();

    static String mes, dias, año, name;
    static int m, di, a;

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
        System.out.println("Programa para determinar el signo zodiacal en base al mes y dia de nacimiento");
    }

    public void datos() {

        p.setVisible(true);
        name = d.readString("Ingresa tu nombre: ");

        p.setVisible(true);
        do año = d.readString("Ingresa tu año de nacimiento (2000):");
        while (!isNum(año));
        a = Integer.parseInt(año);

        p.setVisible(true);
        do mes = d.readString("Ingresa tu mes de nacimiento (1-12):");
        while (!isNum(mes));
        m = Integer.parseInt(mes);

        p.setVisible(true);
        do dias = d.readString("Ingresa tu dia de nacimiento (1-31):");
        while (!isNum(dias));
        di = Integer.parseInt(dias);

    }

    public void mostrarMensaje(String signo) {
        p.setVisible(true);
        p.out("Tu nombre es: " + name);
        p.out("\nTu fecha de nacimiento: \ndia: " + di + " mes: " + m + " año: " + a);
        p.out("\nTu signo es: " + signo);
        p.out("\nJava es la ondita, la ondita les digo");
    }

    public void calculos() {
        SignoZodiacal signoZodiacal = new SignoZodiacal();
        switch (m) {

            case 1:
                //Enero
                if (di >= 20) {
                    signoZodiacal.mostrarMensaje("Acuario");
                    p.ofoto("acuario.jpg");
                } else {
                    signoZodiacal.mostrarMensaje("Capricornio");
                    p.ofoto("capricornio.jpg");
                }
                break;
            case 2:
                //Febrero
                if (di >= 19) {
                    signoZodiacal.mostrarMensaje("Picis");
                    p.ofoto("picis.jpg");
                } else {
                    signoZodiacal.mostrarMensaje("Acuario");
                    p.ofoto("acuario.jpg");
                }
                break;
            case 3:
                //Marzo
                if (di >= 21) {
                    signoZodiacal.mostrarMensaje("Aries");
                    p.ofoto("aries.jpg");
                } else {
                    signoZodiacal.mostrarMensaje("Picis");
                    p.ofoto("picis.jpg");
                }
                break;
            case 4:
                //Abril
                if (di >= 19) {
                    signoZodiacal.mostrarMensaje("Tauro");
                    p.ofoto("tauro.jpg");
                } else {
                    signoZodiacal.mostrarMensaje("Aries");
                    p.ofoto("aries.jpg");
                }
                break;
            case 5:
                //Mayo
                if (di >= 21) {
                    signoZodiacal.mostrarMensaje("Geminis");
                    p.ofoto("geminis");
                } else {
                    signoZodiacal.mostrarMensaje("Tauro");
                    p.ofoto("tauro");
                }
                break;
            case 6:
                //Junio
                if (di >= 21) {
                    signoZodiacal.mostrarMensaje("Cancer");
                    p.ofoto("cancer.jpg");
                } else {
                    signoZodiacal.mostrarMensaje("Geminis");
                    p.ofoto("geminis.jpg");
                }
                break;
            case 7:
                //Julio
                if (di >= 23) {
                    signoZodiacal.mostrarMensaje("Leo");
                    p.ofoto("leo.jpg");
                } else {
                    signoZodiacal.mostrarMensaje("Cancer");
                    p.ofoto("cancer.jpg");
                }
                break;
            case 8:
                //Agosto
                if (di >= 23) {
                    signoZodiacal.mostrarMensaje("Virgo");
                    p.ofoto("virgo.jpg");
                } else {
                    signoZodiacal.mostrarMensaje("Leo");
                    p.ofoto("leo.jpg");
                }
                break;

            case 9:
                //Septiembre
                if (di >= 23) {
                    signoZodiacal.mostrarMensaje("Libra");
                    p.ofoto("libra.jpg");
                } else {
                    signoZodiacal.mostrarMensaje("Virgo");
                    p.ofoto("virgo.jgp");
                }
                break;
            case 10:
                //Octubre
                if (di >= 23) {
                    signoZodiacal.mostrarMensaje("Escorpio");
                    p.ofoto("escorpio.jpg");
                } else {
                    signoZodiacal.mostrarMensaje("Libra");
                    p.ofoto("sagitario");
                }
                break;
            case 11:
                //Noviembre
                if (di >= 22) {
                    signoZodiacal.mostrarMensaje("Sagitario");
                    p.ofoto("sagitario.jpg");
                } else {
                    signoZodiacal.mostrarMensaje("Escorpio");
                    p.ofoto("escorpio.jpg");
                }
                break;
            case 12:
                //Diciembre
                if (di >= 21) {
                    signoZodiacal.mostrarMensaje("Capricornio");
                    p.ofoto("capricornio.jpg");
                } else {
                    signoZodiacal.mostrarMensaje("Sagitario");
                    p.ofoto("sagitario");
                }
                break;
        }
    }

    public static void main(String[] args) throws IOException {
        SignoZodiacal signoZodiacal = new SignoZodiacal();

        Pizarra p = new Pizarra();
        Dialog d = new Dialog();
        String resp = "s";
        p.setVisible(true);

        signoZodiacal.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            signoZodiacal.datos();
            signoZodiacal.calculos();
            resp = d.readString("¿Desea calcular otro numero? s/n");
            if (resp.equals("n") || resp.equals("N")) {
                System.exit(0);
            }
            System.in.skip(2);
        }


    }
}

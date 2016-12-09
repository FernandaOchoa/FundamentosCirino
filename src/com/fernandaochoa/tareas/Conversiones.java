package com.fernandaochoa.tareas;

/*Conversiones.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Días y horario del curso
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Tarea #: __4_____
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

import cstio.Dialog;
import cstio.Pizarra;

import java.io.IOException;

public class Conversiones {
    ConversionesCapsula conversion = new ConversionesCapsula();
    Pizarra p = new Pizarra();
    Dialog d = new Dialog();

    //Inicio
    void inicio() {
        System.out.println("Programa de Conversion de Unidades Metrico / Decimal poquitas");
    }

    double a,b,c;
    //Datos

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

    void datos(ConversionesCapsula c) {
        //Preparamos interfaz y variables
        String v;


        v = d.readString("Selecciona opcion de conversion"
                + "\n1 ingles a metrico"
                + "\n2 metrico a ingles"
                + "\n3 metrico a metrico"
                + "\n4 ingles a ingles");
        c.setopc((Integer.parseInt(v)));
        int opc = (int) conversion.getopc();
        switch (opc) {
            case 1:
                v = d.readString("Selecciona la opcion de conversion"
                        + "\n1 Pies a metros"
                        + "\n2 Pies a centimetros"
                        + "\n3 Pies a Metros y Centimetros"
                        + "\n4 Pulgadas a metros"
                        + "\n5 Pulgadas a centimetros"
                        + "\n6 Pulgadas a Metros y Centimetros"
                        + "\n7 Pies y Pulgadas a metros"
                        + "\n8 Pies y Pulgadas a centimetros"
                        + "\n9 Pies y Pulgadas a Metros y Centimetros");
                c.setopc1((Integer.parseInt(v)));


                break;
            case 2:
                v = d.readString("Selecciona la opcion de conversion"
                        + "\n1 Metros a Pies"
                        + "\n2 Metros a Pulgadas"
                        + "\n3 Metros a Pies y Pulgadas"
                        + "\n4 Centimetros a Pies"
                        + "\n5 Centimetros a Pulgadas"
                        + "\n6 Centimetros a Pies y Pulgadas"
                        + "\n7 Metros y Centimetros a Pies"
                        + "\n8 Metros y Centimetros a Pulgadas"
                        + "\n9 Metros y Centimetros a Pies y Pulgadas");
                c.setopc1((Integer.parseInt(v)));
                break;
            case 3:
                v = d.readString("Selecciona la opcion de conversion"
                        + "\n1 Metros a Centimetros"
                        + "\n2 Metros a Metros y Centimetros"
                        + "\n3 Centimetros a Metros"
                        + "\n4 Centimetros a Metros y Centimetros"
                        + "\n5 Metros y Centimetros a Centimetros"
                        + "\n9 Metros y Centimetros a Metros");
                c.setopc1((Integer.parseInt(v)));
                break;
            case 4:
                v = d.readString("Selecciona la opcion de conversion"
                        + "\n1 Pies a Pulgadas"
                        + "\n2 Pies a Pies y Pulgadas"
                        + "\n3 Pulgadas a Pies"
                        + "\n4 Pulgadas a Pies y Pulgadas"
                        + "\n5 Pies y Pulgadas a Pies"
                        + "\n9 Pies y Pulgadas a Pulgadas");
                c.setopc1((Integer.parseInt(v)));
                break;
        }

        do v = d.readString("\n Ingrese el valor: \n");
        while (!isNum(v));
        c.setvalor((Double.parseDouble(v)));
    }

    //Calculos
    void calculos(ConversionesCapsula c) {
        int opc = (int) conversion.getopc();
        int opc1 = (int) conversion.getopc1();
        double valor = (double) conversion.getvalor();


        switch (opc) {

            case 1:

                break;
            case 2:
                switch (opc1) {
                    case 1:
                        a = valor * 3.28084;
                        break;
                    case 2:
                        a = valor * 39.3701;
                        break;
                    case 3:
                        a = valor * 3.28084;
                        b = (valor * 3.28084)-(valor * 3.28084)%1;
                        this.c = a%1*12;
                        break;
                    case 4:
                        a = (valor * 3.28084)/100;
                        break;
                    case 5:
                        a = (valor * 39.3701)/100;
                        break;
                    case 6:
                        a = (valor * 3.28084)/100;
                        b = ((valor * 3.28084)/100)-((valor * 3.28084)/100)%1;
                        this.c = (a%1*12);
                        break;
                    case 7:
                        a = valor * 3.28084;
                        break;
                    case 8:
                        a = valor * 39.3701;
                        break;
                    case 9:
                        a = valor * 3.28084;
                        b = (valor * 3.28084)-(valor * 3.28084)%1;
                        this.c = a%1*12;

                        break;
                }
                break;
            case 3:
                switch (opc1) {
                    case 1:
                        a = valor*100;
                        break;
                    case 2:
                        a = valor;
                        break;
                    case 3:
                        a = valor/100;
                        break;
                    case 4:
                        a = valor*100;
                        break;
                    case 5:
                        a = valor;
                        break;
                    case 6:
                        a = valor*100;
                        break;
                }
                break;
            case 4:
                switch (opc1) {
                    case 1:
                        a  = valor*12;
                        break;
                    case 2:
                        a  = valor;
                        b = a%1*12;
                        break;
                    case 3:
                        a  = valor*.083;
                        break;
                    case 4:
                        a  = valor*.083;
                        break;
                    case 5:
                        a  = valor;
                        break;
                    case 6:
                        a  = valor*12;
                        break;
                }
                break;
        }
    }

    //Resultado
    void resultado() {

        p.setVisible(true);
        p.out("El valor es "+a);
    }

    public static void main(String[] args) throws IOException {

        Conversiones conversiones = new Conversiones();

        Pizarra p = new Pizarra();
        Dialog d = new Dialog();
        String resp = "s";

        conversiones.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            conversiones.datos(conversiones.conversion);
            conversiones.calculos(conversiones.conversion);
            conversiones.resultado();
            resp = d.readString("¿Desea calcular otra conversion? s/n");
            if (resp.equals("n") || resp.equals("N")) {
                System.exit(0);
            }
            System.in.skip(2);
        }
    }

}

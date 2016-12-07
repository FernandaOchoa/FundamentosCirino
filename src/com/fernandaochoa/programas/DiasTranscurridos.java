package com.fernandaochoa.programas;

import com.fernandaochoa.capsulas.Dias;
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

public class DiasTranscurridos {
    Dias dias = new Dias();
    Pizarra p = new Pizarra();

    public void inicio() {
        System.out.println("Para calcular los dias transcurridos en el año");
    }

    int diasr, b, dia, mes, año;

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


    public void datos(Dias dias) {
        Dialog d = new Dialog();
        String aux;

        do aux = d.readString("Ingrese el año actual:");
        while (!isNum(aux));
        dias.setAño((Integer.parseInt(aux)));

        do aux = d.readString("Ingrese el mes actual:");
        while (!isNum(aux));
        dias.setMes((Integer.parseInt(aux)));

        do aux = d.readString("Ingrese el dia actual:");
        while (!isNum(aux));
        dias.setDia((Integer.parseInt(aux)));


    }


    public void calculos() {
        año = (int) dias.getAño();
        mes = (int) dias.getMes();
        dia = (int) dias.getDia();

        if (año % 4 == 0) {
            b = 1;
        } else {
            b = 0;
        }

        switch (mes) {
            case 1:
                dia = dia;
                break;
            case 2:
                dia = dia + 31;
                break;
            case 3:
                dia = dia + 59 + b;
                break;
            case 4:
                dia = dia + 90 + b;
                break;
            case 5:
                dia = dia + 120 + b;
                break;
            case 6:
                dia = dia + 151 + b;
                break;
            case 7:
                dia = dia + 181 + b;
                break;
            case 8:
                dia = dia + 212 + b;
                break;
            case 9:
                dia = dia + 243 + b;
                break;
            case 10:
                dia = dia + 273 + b;
                break;
            case 11:
                dia = dia + 304 + b;
                break;
            case 12:
                dia = dia + 334 + b;
                break;

        }
        diasr = (365 + b) - dia;
    }


    void resultados() {

        p.setVisible(true);

        p.out("\nHan transucrrido: " + dia + " dias \n");
        p.out("\n para acabar el año faltan " + diasr + " dias\n");
        if (año % 4 == 0) {
            p.out("\nEste año es bisiesto\n");
        }
        p.ofoto("calendario.jpg");
    }

    public static void main(String[] args) throws IOException {
        DiasTranscurridos a = new DiasTranscurridos();
        String resp = "s";

        a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos(a.dias);
            a.calculos();
            a.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea calcular otra fecha? s/n");
            System.in.skip(2);
        }
    }

}

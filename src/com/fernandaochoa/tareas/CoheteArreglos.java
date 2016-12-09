package com.fernandaochoa.tareas;

/*CoheteArreglos.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Tarea #: __7_____
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

import cstio.Dialog;
import cstio.Pizarra;

import java.io.IOException;

public class CoheteArreglos {
    Dialog d = new Dialog();
    private int dia, hora, min, seg, tiempo, cohetes;
    private int dias[], horas[], mins[], segs[], tiempos[], dia2[], hora2[], min2[], seg2[], horaRegreso[];


    public boolean isNum(String cad) {
        try {
            Integer.parseInt(cad);
            return true;
        } catch (NumberFormatException nfe) {
            d.display("Solo se aceptan valores numericos");
            return false;
        }
    }

    public void tamaño() {
        String v;
        do v = d.readString("Cuantos cohetes quieres calcular?");
        while (!isNum(v));
        cohetes = Integer.parseInt(v);
        dias = new int[cohetes];
        horas = new int[cohetes];
        mins = new int[cohetes];
        segs = new int[cohetes];
        tiempos = new int[cohetes];
        horaRegreso = new int[cohetes];

        dia2 = new int[cohetes];
        hora2 = new int[cohetes];
        min2 = new int[cohetes];
        seg2 = new int[cohetes];


    }

    public void inicio() {
        d.display("Programa para calcular el tiempo de vuelo de uno(s) cohetes\n");
    }

    public void datos() {
        String v;
        int numero;

        for (int i = 0; i < cohetes; i++) {

            do v = d.readString("Ingrese la hora en que se fue el cohete: " + (i + 1));
            while (!isNum(v));
            numero = Integer.parseInt(v);
            horas[i] = numero;
            System.out.println(numero);
            System.out.println(horas[i]);

            do v = d.readString("Ingrese los minutos en que se fue el cohete: " + (i + 1));
            while (!isNum(v));
            numero = Integer.parseInt(v);
            mins[i] = numero;
            System.out.println(numero);
            System.out.println(mins[i]);

            do v = d.readString("Ingrese los segundos en que se fue el cohete: " + (i + 1));
            while (!isNum(v));
            numero = Integer.parseInt(v);
            segs[i] = numero;
            System.out.println(numero);
            System.out.println(segs[i]);

            do v = d.readString("Ingrese el tiempo de vuelo del cohete: " + (i + 1));
            while (!isNum(v));
            numero = Integer.parseInt(v);
            tiempos[i] = numero;
            System.out.println(numero);
            System.out.println(tiempos[i]);
        }
    }

    public void calculos() {
        for (int i = 0; i < cohetes; i++) {

            hora2[i] = horas[i] * 3600;
            min2[i] = mins[i] * 60;
            tiempos[i] = hora2[i] + min2[i] + tiempos[i];

            dia = tiempos[i] / 86400;
            dias[i] = dia;

            hora = (tiempos[i] - (86400 * dias[i])) / 3600;
            horas[i] = +hora;

            min = (tiempos[i] - ((3600 * horas[i]) + (86400 * dias[i]))) / 60;
            mins[i] = +min;

            seg = tiempos[i] - (((horas[i] * 3600) + (mins[i] * 60) + (86400 * dias[i])));
            segs[i] = seg;

        }
    }

    public void resultados() {
        Pizarra p = new Pizarra();
        p.setVisible(true);
        p.out("Bienvenido al programa para calcular los tiempos de vuelo de varios\n"
                + "cohetes");
        for (int i = 0; i < cohetes; i++) {
            p.out("La hora de regreso los cohetes es:\n"
                    + "dias: " + dias[i] + "\n"
                    + "horas: " + horas[i] + "\n"
                    + "minutos: " + mins[i] + "\n"
                    + "segundos: " + segs[i] + "\n");
            p.ofoto("cohete.jpg");
        }
    }

    public static void main(String[] args) throws IOException {
        CoheteArreglos c = new CoheteArreglos();
        char resp = 's';

        c.inicio();
        while (resp == 's') {
            c.tamaño();
            c.datos();
            c.calculos();
            c.resultados();

            String res = c.d.readString("¿Hacer mas cohetes? s/n");
            res = res.toLowerCase();
            resp = res.charAt(0);
            System.in.skip(2);
        }
    }

}

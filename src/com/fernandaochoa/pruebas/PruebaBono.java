package com.fernandaochoa.pruebas;

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

import com.fernandaochoa.capsulas.Bono;
import cstio.Dialog;
import cstio.Pizarra;

import java.io.IOException;

public class PruebaBono {
    Bono bono = new Bono();

    String name, h, a;
    int horasExtra, ausencias, bon, bonos;
    int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0;

    Pizarra p = new Pizarra();
    Dialog d = new Dialog();

    public void inicio() {
        System.out.println("Programa para calcular el bono de navidad de los empleados");
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

    void datos(Bono bono) {
        p.setVisible(true);
        do name = d.readString("Ingrese el Nombre del Empleado:");
        while (name.isEmpty());
        bono.setNombre(name);

        p.setVisible(true);
        do h = d.readString("Ingrese las horas extras trabajadas:");
        while (!isNum(h));
        horasExtra = Integer.parseInt(h);
        bono.setHorasExtra(horasExtra);

        p.setVisible(true);
        do a = d.readString("Ingrese la cantidad de ausencias:");
        while (!isNum(a));
        ausencias = Integer.parseInt(a);
        bono.setAusencias(ausencias);


    }

    void calculos() {
        //Formula x= HorasExtras - 2/3 ausencias
        int x = horasExtra - (2 / 3 * ausencias);
        int bon;

        if (x >= 20) {
            bon = 500;
            this.bon = bon;
            c1++;
        }
        if ((15 <= x) && (x < 20)) {
            bon = 400;
            this.bon = bon;
            c2++;
        }
        if ((10 <= x) && (x <= 15)) {
            bon = 300;
            this.bon = bon;
            c3++;
        }
        if ((0 <= x) && (x <= 10)) {
            bon = 200;
            this.bon = bon;
            c4++;
        } else {
            bon = 100;
            this.bon = bon;
            c5++;
        }
        bonos = (c1 + c2 + c3 + c4 + c5);

    }

    void resultados() {
        p.out("El empleado " + bono.getNombre() + "\ntrabajo " + bono.getHorasExtra() + " horas extras " + "\ncon un total de " +
                bono.getAusencias() + " ausencia (s) y recibio un bono de " + bon+"\n");

        p.out("La empresa ha pagado " + bonos + " bonos de los cuales: \n" + c1 + " es de $500 \n" + c2 +
                " es de $400 \n" + c3 + " es de $300 \n" + c4 + " es de $200 \n" + c5 + " es de $100 \n");
        p.ofoto("grinch.jpg");
    }

    public static void main(String[] args) throws IOException {
        PruebaBono pb = new PruebaBono();


        Pizarra p = new Pizarra();
        Dialog d = new Dialog();
        String resp = "s";

        pb.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            pb.datos(pb.bono);
            pb.calculos();
            pb.resultados();
            resp = d.readString("¿Desea calcular otro bono navideño? s/n");
            if (resp.equals("n") || resp.equals("N")) {
                System.exit(0);
            }
            System.in.skip(2);
        }
    }
}



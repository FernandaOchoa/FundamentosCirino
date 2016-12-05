package com.fernandaochoa.pruebas;

import com.fernandaochoa.capsulas.Aumento;
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
public class PruebaAumento {
    String nombre, s;
    int sueldo;
    double nuevo;
    int au;

    Aumento aumento = new Aumento();

    Pizarra p = new Pizarra();
    Dialog d = new Dialog();

    //Meta
    public void inicio() {
        System.out.println("Programa para calcular el aumento de los empleados");
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

    void datos(Aumento aumento) {

        p.setVisible(true);
        do nombre = d.readString("Ingrese el Nombre del Empleado:");
        while (nombre.isEmpty());
        aumento.setNombre(nombre);

        p.setVisible(true);
        do s = d.readString("Ingrese el sueldo base del Empleado:");
        while (!isNum(s));
        sueldo = Integer.parseInt(s);
        aumento.setSueldo(sueldo);
    }

    void calculos() {

        if (sueldo <= 2000) {
            nuevo = sueldo * 1.3;
            au = 30;
        } else if ((sueldo > 2000) & (sueldo <= 4000)) {
            nuevo = sueldo * 1.25;
            au = 25;
        } else if ((sueldo > 4000) & (sueldo < 10000)) {
            nuevo = sueldo * 1.1;
            au = 10;
        } else if (sueldo >= 10000) {
            nuevo = sueldo * 1.05;
            au = 5;
        }
    }

    void resultados() {
        p.out("El empleado " + aumento.getNombre() + " tenia un sueldo de: " + aumento.getSueldo() + " \n y se le realizo un aumento de " + au + " ahora gana: " + nuevo+"\n");
        p.ofoto("aumento.jpg");
    }

    public static void main(String[] args) throws IOException {
        PruebaAumento pa = new PruebaAumento();
        Pizarra p = new Pizarra();
        Dialog d = new Dialog();
        String resp = "s";

        pa.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            pa.datos(pa.aumento);
            pa.calculos();
            pa.resultados();
            resp = d.readString("¿Desea calcular otro sueldo? s/n");
            if (resp.equals("n") || resp.equals("N")) {
                System.exit(0);
            }
            System.in.skip(2);
        }
    }
}

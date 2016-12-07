package com.fernandaochoa.pruebas;

import com.fernandaochoa.capsulas.Bicycle;
import cstio.Dialog;
import cstio.Pizarra;

import java.io.IOException;
import java.util.Scanner;

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

public class PruebaBicicleta {
    Scanner teclado = new Scanner (System.in);

    Bicycle c1 = new Bicycle();

    void inicio () {
        System.out.println("Para observar las propiedades de la bicicleta  ");

    }
    boolean isNum(String cad) {
        Dialog d = new Dialog();
        try {
            Double.parseDouble(cad);
            return true;
        }
        catch(NumberFormatException nfe) {
            d.display("solo se admiten valores numericos");}
        return false;
    }

    void datos (Bicycle p) { //No. 1 introducir datos
        Pizarra x = new Pizarra();
        Dialog d = new Dialog();
        String v;
        int numero;

        x.setVisible(true);
        do  v = d.readString ("Ingrese la cantidad de PiÃ±ones:");
        while (!isNum(v));
        numero=Integer.parseInt(v);
        p.setPiñones(numero);


        do v = d.readString ("Ingrese la cantidad de rodadas hechas:");
        while (!isNum(v));
        numero=Integer.parseInt(v);
        p.setRodada(numero);


        do  v = d.readString ("Ingrese la velocidad:");
        while (!isNum(v));
        numero=Integer.parseInt(v);
        p.setVelocidad(numero);

    }
    // No. 2 no hay calculos

    void resultados (){ //No. 3 Imprimir
        Pizarra p = new Pizarra();
        p.out("Programa para modelar una bicicleta\n");
        p.setVisible(true);

        p.out("\nSu bicicleta tiene las siguientes piezas:\n"+c1.printStates());
        p.out("\n");
        p.ofoto("bicicleta.jpg");   //change
    }
    public static void main(String[] args) throws IOException {
        PruebaBicicleta dist= new PruebaBicicleta();
        int resp = 'S';

        dist.inicio();
        while (resp == 's' || resp =='S') {
            dist.datos(dist.c1);
            dist.resultados();
            System.out.print("Ver otra bicicleta? s/n");
            resp = System.in.read();
            System.in.skip(2);
        }
    }
}


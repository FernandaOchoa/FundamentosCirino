package com.fernandaochoa.pruebas;

import com.fernandaochoa.capsulas.Point;

import java.io.IOException;
import java.util.Scanner;

/*PruebaDistancia.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #: 17
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/
public class PruebaDistancia {
    static Point c1 = new Point();
    static Point c2 = new Point();
    Scanner teclado = new Scanner(System.in);
    //String resp;
    double d;

    public static void main(String[] args) throws IOException {
        int resp;
        do {

            PruebaDistancia dist = new PruebaDistancia();

            dist.inicio();
            dist.datos(c1);
            dist.datos(c2);
            dist.calculos();
            dist.resultados();

            System.out.println("Desea calcular otra distancia? s/n");
            resp = System.in.read();
            System.in.skip(2);

        } while (resp == 's' || resp == 'S');
    }

    void inicio() {
        System.out.println("Para calcular la distancia entre dos puntos \n"
                + "alimentados por el usuario");
    }

    void datos(Point p) {
        System.out.print("Da el valor de x: ");
        p.setX(teclado.nextInt());
        System.out.print("Da el valor de y: ");
        p.setY(teclado.nextInt());
    }

    void calculos() {
        double difX, difY;
        difX = c2.getX() - c1.getX();
        difY = c2.getY() - c2.getY();
        d = Math.sqrt(Math.pow(difX, 2) + Math.pow(difY, 2));
    }

    void resultados() {
        System.out.println("Cuando la coordenada 1 esta en:(" + Integer.toString(c1.getX()) + "," + Integer.toString(c1.getY()) + ")");
        System.out.println("Cuando la coordenada 2 esta en:(" + Integer.toString(c2.getX()) + "," + Integer.toString(c2.getY()) + ")");
        System.out.println("La distancia es: " + d);
    }
}

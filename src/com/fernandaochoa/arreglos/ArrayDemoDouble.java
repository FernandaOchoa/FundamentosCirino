package com.fernandaochoa.arreglos;
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

public class ArrayDemoDouble {
    public static void main(String[] args) {
        double anArray[];

        anArray = new double[10];

        for (int i = 0; i < anArray.length; i++) {
            double tmp = Math.round((float) Math.random() * 100000 % 1.79769e308);
            anArray[i] = (double) tmp;

            System.out.println("A[" + i + "]=" + anArray[i] + ",");
        }
        System.out.println();
    }
}
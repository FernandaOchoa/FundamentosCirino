package com.fernandaochoa.arreglos;

/*ArrayDemoLong.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #: 60
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/
public class ArrayDemoLong {

    public static void main(String[] args) {

        long anArray[];
        anArray = new long[10];

        for (int i = 0; i < anArray.length; i++) {
            long tmp = Math.round((float) Math.random() * 100000 % 9e18);
            anArray[i] = (long) tmp;
            System.out.println("A[" + i + "]=" + anArray[i] + ",");
        }
        System.out.println();
    }
}
package com.fernandaochoa.arreglos;
/*ArrayDemoInt.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #: 59
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

public class ArrayDemoInt {

    public static void main(String[] args) {

        int anArray[];
        anArray = new int[10];

        for (int i = 0; i < anArray.length; i++) {
            int tmp = Math.round((float) Math.random() * 100000 % 2147483647);
            anArray[i] = (int) tmp;
            System.out.println("A[" + i + "]=" + anArray[i] + ",");
        }
        System.out.println();
    }
}
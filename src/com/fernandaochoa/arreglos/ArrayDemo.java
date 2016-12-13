package com.fernandaochoa.arreglos;
/*ArrayDemo.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #: 64
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

public class ArrayDemo {

    public static void main(String[] args) {

        char anArray[];
        anArray = new char[10];

        for (int i = 0; i < anArray.length; i++) {
            int tmp = Math.round((float) Math.random() * 100000 % 65535);
            anArray[i] = (char) tmp;
            System.out.println("A[" + i + "]=" + anArray[i] + ",");
        }
        System.out.println();
    }
}
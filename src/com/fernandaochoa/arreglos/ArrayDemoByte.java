package com.fernandaochoa.arreglos;
/*ArrayDemoByte.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #: 56
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

public class ArrayDemoByte {

    public static void main(String[] args) {

        byte anArray[];
        anArray = new byte[10];

        for (int i = 0; i < anArray.length; i++) {
            int tmp = Math.round((float) Math.random() * 100000 % 65535);
            anArray[i] = (byte) tmp;
            System.out.println("A[" + i + "]=" + anArray[i] + ",");
        }
        System.out.println();
    }
}
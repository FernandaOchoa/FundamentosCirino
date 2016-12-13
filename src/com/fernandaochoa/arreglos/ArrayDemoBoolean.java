package com.fernandaochoa.arreglos;
/*ArrayDemoBoolean.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicios #: 55
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

public class ArrayDemoBoolean {

    public static void main(String[] args) {

        boolean anArray[];
        anArray = new boolean[10];

        for (int i = 0; i < anArray.length; i++) {
            boolean tmp = Math.random() > 0.5 ? true : false;
            anArray[i] = (boolean) tmp;
            System.out.println("A[" + i + "]=" + anArray[i] + ",");
        }
        System.out.println();
    }
}
/*
if (Math.random() > 0.5){
	anArray [i] = true;
else anArray[i] = false;
*/
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
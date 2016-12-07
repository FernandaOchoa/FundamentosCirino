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

public class ArrayDemoFloat {
    public static void main(String[] args) {
        float anArray[];

        anArray = new float[10];

        for (int i = 0; i < anArray.length; i++) {
            float tmp = Math.round((float) Math.random() * 100000 % 3.40282e38);
            anArray[i] = (float) tmp;

            System.out.println("A[" + i + "]=" + anArray[i] + ",");
        }
        System.out.println();
    }
}
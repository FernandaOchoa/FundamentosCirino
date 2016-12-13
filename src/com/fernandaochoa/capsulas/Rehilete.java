package com.fernandaochoa.capsulas;

/*Rehilete.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #: 53
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

public class Rehilete {

    private int n;

    public int getN() {
        return n;
    }

    public boolean setN(int n) {
        if (n > 0) {
            this.n = n;
            return true;
        } else return false;
    }
}
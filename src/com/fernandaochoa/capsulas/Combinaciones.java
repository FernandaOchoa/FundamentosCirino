package com.fernandaochoa.capsulas;

/*Combinaciones.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #: 48.1
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

public class Combinaciones {

    private int cosas;
    private int posibles;

    public int getCosas() {
        return cosas;
    }

    public int getPosibles() {
        return posibles;
    }

    public boolean setCosas(int cosas) {
        if (cosas > 0) {
            this.cosas = cosas;
            return true;
        } else return false;
    }

    public boolean setPosibles(int posibles) {
        if (posibles > 0) {
            this.posibles = posibles;
            return true;
        } else return false;
    }
}

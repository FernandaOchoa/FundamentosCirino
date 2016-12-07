package com.fernandaochoa.capsulas;

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

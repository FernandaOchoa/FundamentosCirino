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

//Ejercicio 25
public class Hipotenusa {
    private float opuesto, adyacente;

    public float getAdyacente() {
        return adyacente;
    }

    public float getOpuesto() {
        return opuesto;
    }

    public boolean setOpuesto(float opuesto) {
        if (opuesto > 0) {
            this.opuesto = opuesto;
            return true;
        } else
            return false;
    }

    public boolean setAdyacente(float adyacente) {
        if (adyacente > 0) {
            this.adyacente = adyacente;
            return true;
        } else
            return false;
    }
}

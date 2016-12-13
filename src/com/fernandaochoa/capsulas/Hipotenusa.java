package com.fernandaochoa.capsulas;

/*Hipotenusa.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #: 25
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

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
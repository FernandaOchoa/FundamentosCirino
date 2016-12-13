package com.fernandaochoa.capsulas;

/*Factores.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #: 43.1
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

public class Factores {

    double numero;

    public double getNumero() {
        return numero;
    }

    public boolean setNumero(double numero) {
        if (numero > 0) {
            this.numero = numero;
            return true;
        } else return false;
    }
}

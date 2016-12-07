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

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

//Ejercicio 23
public class Numeros {
    private int x1, x2, x3;

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getX3() {
        return x3;
    }

    public boolean setX1(int x1) {
        if (x1 > 0) {
            this.x1 = x1;
            return true;
        } else
            return false;
    }

    public boolean setX2(int x2) {
        if (x2 > 0) {
            this.x2 = x2;
            return true;
        } else
            return false;
    }

    public boolean setX3(int x3) {
        if (x3 > 0) {
            this.x3 = x3;
            return true;
        } else
            return false;
    }
}

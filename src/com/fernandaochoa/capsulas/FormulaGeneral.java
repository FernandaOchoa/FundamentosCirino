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

//Ejercicio 26
public class FormulaGeneral {
    private int a, b, c;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public boolean setA(int a) {
        if (a < 0) {
            this.a = a;
            return true;
        } else
            return false;
    }

    public boolean setB(int b) {
        if (b > 0) {
            this.b = b;
            return true;
        } else
            return false;
    }

    public boolean setC(int c) {
        if (c > 0) {
            this.c = c;
            return true;
        } else
            return false;
    }
}

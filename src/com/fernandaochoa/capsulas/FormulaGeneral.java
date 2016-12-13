package com.fernandaochoa.capsulas;

/*FormulaGeneral.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #: 26
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

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
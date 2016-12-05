package com.fernandaochoa.capsulas;

/**
 * Created by monsh on 03/12/2016.
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

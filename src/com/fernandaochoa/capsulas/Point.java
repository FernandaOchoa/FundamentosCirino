package com.fernandaochoa.capsulas;

/**
 * Created by monsh on 03/12/2016.
 */
//Ejercicio 11
public class Point {
    private int x,y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "( "+ x + ","+ y + ")";
    }
}

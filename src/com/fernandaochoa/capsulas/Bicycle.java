package com.fernandaochoa.capsulas;

/**
 * Created by monsh on 03/12/2016.
 */

//Ejercicio 18
public class Bicycle {
    public int piñones, rodada;
    public double velocidad;

    public double getVelocidad() {
        return velocidad;
    }

    public int getPiñones() {
        return piñones;
    }

    public int getRodada() {
        return rodada;
    }

    public boolean setPiñones(int piñones) {
        if (piñones > 0) {
            this.piñones = piñones;
            return true;
        } else
            return false;
    }

    public boolean setVelocidad(int velocidad) {
        if (velocidad >= 0) {
            this.velocidad = velocidad;
            return true;
        } else
            return false;
    }

    public boolean setRodada(int rodada) {
        if (rodada > 0) {
            this.rodada = rodada;
            return true;
        } else
            return false;
    }
}

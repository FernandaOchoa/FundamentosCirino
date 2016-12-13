package com.fernandaochoa.capsulas;

/*Bicicycle.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #: 18
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

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

    public String printStates(){
        return "piñones "+piñones+"\n"+
                "rodada "+rodada+"\n"+
                "velocidad "+velocidad;
    }
}

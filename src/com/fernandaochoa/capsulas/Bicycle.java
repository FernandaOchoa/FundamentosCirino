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

    public String printStates(){
        return "piñones "+piñones+"\n"+
                "rodada "+rodada+"\n"+
                "velocidad "+velocidad;
    }
}

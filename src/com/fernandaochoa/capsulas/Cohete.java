package com.fernandaochoa.capsulas;

/*Cohete.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #: 21
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

public class Cohete {

    private int hora, minuto, segundo, tiempo;

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public boolean setHora(int hora) {
        if (hora > 0) {
            this.hora = hora;
            return true;
        } else
            return false;
    }

    public boolean setMinuto(int minuto) {
        if (minuto > 0) {
            this.minuto = minuto;
            return true;
        } else
            return false;
    }

    public boolean setSegundo(int segundo) {
        if (segundo > 0) {
            this.segundo = segundo;
            return true;
        } else
            return false;
    }

    public boolean setTiempo(int tiempo) {
        if (tiempo > 0) {
            this.tiempo = tiempo;
            return true;
        } else return false;
    }
}

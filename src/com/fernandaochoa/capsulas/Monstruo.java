package com.fernandaochoa.capsulas;

/*Monstruo.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Tarea #: 5
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/
public class Monstruo {

    String color;
    int ojos, tamaño, brazos, piernas;

    public int getPiernas() {
        return piernas;
    }

    public String getColor() {
        return color;
    }

    public int getOjos() {
        return ojos;
    }

    public int getTamaño() {
        return tamaño;
    }

    public int getBrazos() {
        return brazos;
    }

    public boolean setColor(String color) {
        if (!color.isEmpty()) {
            this.color = color;
            return true;
        } else
            return false;
    }

    public boolean setOjos(int ojos) {
        this.ojos = ojos;
        return true;
    }

    public boolean setTamaño(int tamaño) {
        this.tamaño = tamaño;
        return true;
    }

    public boolean setBrazos(int brazos) {
        this.brazos = brazos;
        return true;
    }

    public boolean setPiernas(int piernas) {
        this.piernas = piernas;
        return true;
    }

    public String printStates() {
        return "color " + color + "\n" +
                "tamaño " + ojos + "\n" +
                "piernas " + piernas + "\n" +
                "brazos " + brazos;
    }
}

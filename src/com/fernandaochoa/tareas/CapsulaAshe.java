package com.fernandaochoa.tareas;

/*CapsulaAshe.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Tarea #: __3_____
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

public class CapsulaAshe {
    private double vida, dañoAtaque, vAtaque, rVida, armadura;
    private int vMovimiento, rMagica;

    public double getVida() {
        return vida;
    }

    public double getDañoAtaque() {
        return dañoAtaque;
    }

    public double getvAtaque() {
        return vAtaque;
    }

    public double getrVida() { return rVida; }

    public double getArmadura() {
        return armadura;
    }

    public int getvMovimiento() {
        return vMovimiento;
    }

    public int getrMagica() {
        return rMagica;
    }

    public boolean setVMovimiento(int vMovimiento) {
        if (vMovimiento > 0) {
            this.vMovimiento = vMovimiento;
            return true;
        } else
            return false;
    }

    public boolean setRMagica(int rMagica) {
        if (rMagica > 0) {
            this.rMagica = rMagica;
            return true;
        } else
            return false;
    }

    public boolean setVida(double vida) {
        if (vida > 0) {
            this.vida = vida;
            return true;
        } else
            return false;
    }

    public boolean setDañoAtaque(double dañoAtaque) {
        if (dañoAtaque > 0) {
            this.dañoAtaque = dañoAtaque;
            return true;
        } else
            return false;
    }

    public boolean setRegeneracionVida(double rVida) {
        if (rVida > 0) {
            this.rVida = rVida;
            return true;
        } else
            return false;
    }

    public boolean setArmadura(double armadura) {
        if (armadura > 0) {
            this.armadura = armadura;
            return true;
        } else
            return false;
    }

    public boolean setVAtaque(double vAtaque) {
        if (vAtaque > 0) {
            this.vAtaque = vAtaque;
            return true;
        } else
            return false;
    }
}

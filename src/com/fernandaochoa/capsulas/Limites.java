package com.fernandaochoa.capsulas;

/*Limites.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #: 47.1
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

public class Limites {

    private String tipo;
    private double valor, valor2;

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public double getValor2() {
        return valor2;
    }

    public boolean setTipo(String tipo) {
        if (!tipo.isEmpty()) {
            this.tipo = tipo;
            return true;
        } else
            return false;
    }

    public boolean setValor(double valor) {
        if (valor > 0) {
            this.valor = valor;
            return true;
        } else return false;
    }

    public boolean setValor2(double valor2) {
        if (valor > 0) {
            this.valor2 = valor2;
            return true;
        } else return false;
    }
}

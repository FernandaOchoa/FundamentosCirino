package com.fernandaochoa.tareas;

/*ConversionesCapsula.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Días y horario del curso
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Tarea #: ___4____
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

public class ConversionesCapsula {

    private int opc, opc1;
    private double valor;

    public int getopc() {
        return opc;
    }

    public int getopc1() {
        return opc1;
    }

    public double getvalor() {
        return valor;
    }

    public boolean setopc(int opc) {
        if (opc >= 0) {
            this.opc = opc;
            return true;
        } else return false;
    }

    public boolean setopc1(int opc1) {
        if (opc1 > 0) {
            this.opc1 = opc1;
            return true;
        } else return false;
    }

    public boolean setvalor(double valor) {
        if (valor > 0) {
            this.valor = valor;
            return true;
        } else return false;
    }

}

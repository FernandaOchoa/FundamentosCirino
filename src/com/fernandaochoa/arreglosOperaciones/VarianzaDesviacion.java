package com.fernandaochoa.arreglosOperaciones;

import cstio.Dialog;
import cstio.Pizarra;

import java.io.IOException;

/*VarianzaDesviacion.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #: 64
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

public class VarianzaDesviacion {
    Dialog d = new Dialog();
    private float datos[] = new float[1000];
    double varianza[] = new double[1000], resultado, desviacion;
    float media;
    int control;

    public boolean isNum(String cad) {
        try {
            Float.parseFloat(cad);
            return true;
        } catch (NumberFormatException nfe) {
            d.display("Solo se aceptan valores numericos");
            return false;
        }
    }

    public void inicio() {
        d.display("Programa para calcular varianza y desviacion entandar");
    }

    public void datos() {
        String v;
        int i = 0;
        float numero = 0;
        char resp = 's';

        while (numero != -1) {
            do
                v = d.readString("Ingresa tus valores\n"
                        + "para salir ingresa -1");
            while (!isNum(v));
            numero = Float.parseFloat(v);
            datos[i] = Integer.parseInt(v);
            i++;
            control = i;
        }
    }

    public void rellenar() {
        for (int i = control; i < datos.length; i++)
            datos[i] = -1;
    }

    public void calculos() {
        int cont = 0;
        float m = 0;
        for (int i = 0; i < control; i++) {
            if (datos[i] != -1) {
                m += datos[i];
                cont++;
            } else break;
        }
        media = m / (cont + 1);
        cont = 1;
        for (int j = 0; j < control; j++) {
            varianza[j] = Math.pow((datos[j] - media), 2);
            cont++;
            resultado += varianza[j];
        }
        resultado /= cont;

        desviacion = Math.sqrt(resultado);
    }

    public void resultados() {
        Pizarra p = new Pizarra();
        p.out("Bienvenido al programa del calculo de desviacion estandar y varianza\n");
        p.setVisible(true);
        for (int i = 0; i < control; i++)
            p.out("El resultado de la varianza es: " + varianza[i] + "\n");
        p.out("El resultado final es: " + resultado + "\n");
        p.out("La desviacion es: " + desviacion + "\n");
    }

    public static void main(String[] args) throws IOException {
        VarianzaDesviacion estadistica = new VarianzaDesviacion();
        char resp = 's';

        estadistica.inicio();
        while (resp == 's') {
            estadistica.datos();
            estadistica.rellenar();
            estadistica.calculos();
            estadistica.resultados();
            String res = estadistica.d.readString("Hacer otros resultadosLados? s/n");
            res = res.toLowerCase();
            resp = res.charAt(0);
            System.in.skip(2);
        }
    }
}
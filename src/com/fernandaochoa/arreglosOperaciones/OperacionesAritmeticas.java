package com.fernandaochoa.arreglosOperaciones;

import com.fernandaochoa.capsulas.Limites;
import cstio.Dialog;
import cstio.Pizarra;

import java.io.IOException;

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

public class OperacionesAritmeticas {
    Limites limite = new Limites();
    Pizarra x = new Pizarra();

    public void inicio() {
        System.out.println("Para calcular limites");
    }

    int i = 0;
    int[] numeros = new int[50];
    int numero = 1;
    double a, valor;


    boolean isNum(String cad) {
        Dialog d = new Dialog();
        try {
            Double.parseDouble(cad);
            return true;
        } catch (NumberFormatException nfe) {
            d.display("solo se admiten valores numericos");
        }
        return false;
    }

    public void datos(Limites limites) {
        Dialog d = new Dialog();
        String aux;


        numero = 1;

        while (numero != 0) {
            do {
                aux = d.readString("Introduce un valor hacer el arreglo,\n"
                        + "para salir introduce 0");
            } while (!isNum(aux));
            numero = Integer.parseInt(aux);
            numeros[i] = numero;
            i++;
            if (Integer.parseInt(aux) == 0) {
                i++;

            }
        }

        do aux = d.readString("\n Introduzca el tipo de operacion que desea realizar\n"
                + " S/R/M/D(suma,resta,multiplicacion o division): \n");
        while (aux.isEmpty());
        limites.setTipo(aux);

        do aux = d.readString("\n Ingrese un escalar: \n");
        while (!isNum(aux));
        limites.setValor((Double.parseDouble(aux)));

    }

    public void calculos() {

    }
  void resultados() {
        valor = (double) limite.getValor();
        String tipo = (String) limite.getTipo();
        x.setVisible(true);

        if (tipo.equals("s") || tipo.equals("S")) {

            for (i = 0; i < numeros.length - 25; i++) {

                a = numeros[i] + valor;
                x.out("El nuevo arreglo utilizando suma ");
                x.out("es " + i + " [ " + a + " ] \n");
            }
        } else if (tipo.equals("r") || tipo.equals("R")) {

            for (i = 0; i < numeros.length - 25; i++) {

                a = numeros[i] - valor;
                x.out("El nuevo arreglo utilizando resta ");
                x.out("es " + i + " [ " + a + " ] \n");
            }

        } else if (tipo.equals("m") || tipo.equals("M")) {

            for (i = 0; i < numeros.length - 25; i++) {

                a = numeros[i] * valor;
                x.out("El nuevo arreglo utilizando multiplicacion ");
                x.out("es " + i + " [ " + a + " ] \n");
            }
        } else if (tipo.equals("d") || tipo.equals("D")) {

            for (i = 0; i < numeros.length - 25; i++) {

                a = numeros[i] / valor;
                x.out("El nuevo arreglo utilizando division ");
                x.out("es " + i + " [ " + a + " ] \n");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        OperacionesAritmeticas operacionesAritmeticas = new OperacionesAritmeticas();
        String resp = "s";


        operacionesAritmeticas.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            operacionesAritmeticas.datos(operacionesAritmeticas.limite);
            operacionesAritmeticas.calculos();
            operacionesAritmeticas.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea seguir en el programa? s/n");
            System.in.skip(2);
        }
    }

}

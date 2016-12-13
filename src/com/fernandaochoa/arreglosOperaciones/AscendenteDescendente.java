package com.fernandaochoa.arreglosOperaciones;

import cstio.Dialog;
import cstio.Pizarra;

import java.io.IOException;

/*AscendenteDescendente.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #: 63
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/
public class AscendenteDescendente {

    Dialog d = new Dialog();
    int datos[] = new int[1000], control, opc;
    int ascendente[] = new int[1000];
    int descendente[] = new int[1000];

    public boolean isNum(String cad) {
        try {
            Integer.parseInt(cad);
            return true;
        } catch (NumberFormatException nfe) {
            d.display("No has ingresado un numero");
            return false;
        }
    }

    public void inicio() {
        d.display("Programa de ordenamiento de arreglos de manera\n"
                + "ascendente o descendente");
    }

    public void datos() {
        String v;
        int i = 0, numero = 0;
        boolean bandera = true;

        while (numero != -1) {
            do v = d.readString("Ingresa un valor para el arreglo\n"
                    + "si deseas salir escribe -1");
            while (!isNum(v));
            numero = Integer.parseInt(v);
            datos[i] = numero;
            i++;
            control = i;
        }
        //hacer un metodo menu para esto
        //cada metodo debe realizar una sola accion
        menu();
    }

    public void menu() {
        String m;
        m = d.readString("De que manera quieres ordenarlos?\n"
                + "1)Ascendente\n"
                + "2)Descendente");
        opc = Integer.parseInt(m);
    }

    public void rellenar() {
        for (int i = control; i < datos.length; i++)
            datos[i] = -1;
        for (int j = 0; j < datos.length; j++) {
            ascendente[j] = datos[j];
            descendente[j] = datos[j];
        }
    }

    public void ordenDescendente() {
        for (int i = 0; i < descendente.length; i++) {
            int max = i;

            //buscar el mayor
            for (int j = i + 1; j < descendente.length; j++) {
                if (descendente[j] > descendente[max])
                    max = j;
            }
            if (i != max) {
                int aux = descendente[i];
                descendente[i] = descendente[max];
                descendente[max] = aux;
            }
        }
    }

    public void ordenAscendente() {
        for (int i = 0; i < ascendente.length - 1; i++) {
            int min = i;
            //Se busca el menor numero
            for (int j = i + 1; j < ascendente.length; j++) {
                if (ascendente[j] < ascendente[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int aux = ascendente[i];
                ascendente[i] = ascendente[min];
                ascendente[min] = aux;
            }
        }
    }

    public void ver() {
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i]);
        }
    }

    public void calculos() {
        switch (opc) {
            case 1:
                ordenAscendente();
                break;
            case 2:
                ordenDescendente();
                break;
        }
    }

    public void resultados() {
        Pizarra p = new Pizarra();
        p.out("Bienvenido al programa de ordenamiento de arreglos\n");
        p.setVisible(true);

        switch (opc) {
            case 1:
                p.out("datosLados ingresados\n");
                for (int i = 0; i < datos.length; i++) {
                    if (datos[i] != -1)
                        p.out(datos[i] + ", ");
                }
                p.out("\n");
                p.out("Datos ascendentes\n");
                for (int j = 0; j < datos.length; j++) {
                    if (ascendente[j] != -1)
                        p.out(ascendente[j] + ", ");
                }
                break;
            case 2:
                p.out("Datos ingresados\n");
                for (int i = 0; i < datos.length; i++) {
                    if (datos[i] != -1)
                        p.out(datos[i] + ", ");
                }
                p.out("\n");
                p.out("Datos Descendentes\n");
                for (int j = 0; j < datos.length; j++) {
                    if (descendente[j] != -1)
                        p.out(descendente[j] + ", ");
                }
                break;
        }
    }

    public static void main(String[] args) throws IOException {
        AscendenteDescendente orden = new AscendenteDescendente();
        char resp = 's';

        orden.inicio();
        while (resp == 's') {
            orden.datos();
            orden.rellenar();
            orden.calculos();
            orden.resultados();
            String res = orden.d.readString("¿Hacer otro ordenamiento? s/n");
            res = res.toLowerCase();
            resp = res.charAt(0);
            System.in.skip(2);
        }
    }
}
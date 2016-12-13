package com.fernandaochoa.arreglosOperaciones;
/*BusquedaSecuencial.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #: 65
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

import cstio.Dialog;
import cstio.Pizarra;

public class BusquedaSecuencial {
    Dialog d = new Dialog();
    private int datos[] = new int[1000], control, opc, encontrado = -1;
    private int ordenado[] = new int[1000], posicion, dato;

    public boolean isNum(String cad) {
        try {
            Integer.parseInt(cad);
            return true;
        } catch (NumberFormatException nfe) {
            d.display("Solo se aceptan valores numericos");
            return false;
        }
    }

    public void inicio() {
        d.display("Programa para hacer busqeudas secuenciales o binarias");
    }

    public void datos() {
        String v, res;
        int i = 0, numero = 0;
        char resp = '-';

        while (numero != -1) {
            do {
                v = d.readString("Ingresa un numero positivo\n"
                        + "para salir ingresa un -1");
            } while (!isNum(v));
            numero = Integer.parseInt(v);
            datos[i] = numero;
            i++;
            control = i;
        }
        v = d.readString("Que tipo de busqueda deseas hacer?\n"
                + "1)Secuencial\n"
                + "2)Binaria");
        opc = Integer.parseInt(v);

        do
            v = d.readString("Ingresa el dato que quieres buscar");
        while (!isNum(v));
        dato = Integer.parseInt(v);
    }

    public void copiar() {
        for (int i = 0; i < ordenado.length; i++)
            ordenado[i] = datos[i];
    }

    public void rellenar() {
        for (int i = control; i < datos.length; i++)
            datos[i] = -1;
        for (int j = 0; j < datos.length; j++)
            ordenado[j] = datos[j];
    }

    public void ordenar() {
        for (int i = 0; i < ordenado.length - 1; i++) {
            if (ordenado[i] != -1) {
                int min = i;
                //Se busca el menor numero
                for (int j = i + 1; j < ordenado.length; j++) {
                    if (ordenado[j] < ordenado[min]) {
                        min = j;
                    }
                }
                if (i != min) {
                    int aux = ordenado[i];
                    ordenado[i] = ordenado[min];
                    ordenado[min] = aux;
                }
            }
        }
    }

    public void calculos() {
        switch (opc) {
            case 1:
                encontrado = secuencial(ordenado, dato);
                break;
            case 2:
                encontrado = binaria(ordenado, dato);
                break;
        }
    }

    public int secuencial(int arreglo[], int d) {
        int posicion = -1;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == d) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    public int binaria(int arreglo[], int d) {
        int n = arreglo.length;
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (arreglo[centro] == d) return centro;
            else if (dato < arreglo[centro])
                sup = centro - 1;
            else
                inf = centro + 1;
        }
        return -1;
    }

    public void resultados() {
        Pizarra p = new Pizarra();
        p.out("Bienvenido al programa de busqueda de datosLados en arreglos\n");
        p.setVisible(true);

        switch (opc) {
            case 1:
                if (encontrado != -1)
                    p.out("El dato: " + dato + " fue encontrado en la posicion \n"
                            + posicion + " en una busqueda secuencial");
                else
                    p.out("No se encontro el dato");
                break;
            case 2:
                if (encontrado != -1)
                    p.out("El dato fue encontrado en el arreglo mediante\n"
                            + "busqueda binaria, en la posicion: " + encontrado);
                else
                    p.out("El dato que buscar no esta en el arreglo");
                break;
        }
    }

    public void ver() {
        //for (int i=0;i<ordenado.length;i++)
        //    System.out.print(ordenado[i]+", ");
        System.out.println(encontrado);
    }

    public static void main(String[] args) {

        BusquedaSecuencial busqueda = new BusquedaSecuencial();

        busqueda.inicio();
        busqueda.datos();
        busqueda.copiar();
        busqueda.rellenar();
        busqueda.ordenar();
        busqueda.calculos();
        busqueda.ver();
        busqueda.resultados();
    }
}
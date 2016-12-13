package com.fernandaochoa.programas;

import com.fernandaochoa.capsulas.Factores;
import cstio.Dialog;
import cstio.Pizarra;

import java.io.IOException;

/*PFactores.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Días y horario del curso
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio: #45
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

public class PFactores {
    Factores factores = new Factores();
    Pizarra p = new Pizarra();
    double   factor = 1;

    public void inicio() {
        System.out.println("Para calcular los factores");
    }

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

    public void datos(Factores y){
        Dialog d = new Dialog();
        String aux;

        do aux = d.readString("Ingrese un numero natural (0 a infinito):");
        while (!isNum(aux));
        y.setNumero((Double.parseDouble(aux)));
    }

    void resultados() {
        p.setVisible(true);
        int numero = (int) factores.getNumero();
        while(factor <= numero){
            if(numero % factor == 0)
                p.out(factor + " \nes el factor de " + numero+"\n");
            factor ++;
        }
        p.ofoto("factor.png");
    }

    public static void main(String[] args) throws IOException {
        PFactores PFactores = new PFactores();
        String resp = "s";

        PFactores.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            PFactores.datos(PFactores.factores);
            PFactores.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea calcular otro factor? s/n");
            System.in.skip(2);
        }
    }
}
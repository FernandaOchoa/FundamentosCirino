package com.fernandaochoa.programas;

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

public class LimitesTemperatura {
    Limites limites = new Limites();
    Pizarra p = new Pizarra();

    public void inicio() {
        System.out.println("Para calcular limites de una Temperatura");
    }

    double a,valor,valor2;

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

    public void datos(Limites limites){
        Dialog d = new Dialog();
        String aux;

        do aux = d.readString("\n Introduzca el tipo de escala que desea convertir C/F: \n");
        while (aux.isEmpty());
        limites.setTipo(aux);

        do aux = d.readString("\n Ingrese el limite inferior: \n");
        while (!isNum(aux));
        limites.setValor((Double.parseDouble(aux)));

        do aux = d.readString("\n Ingrese el limite superior: \n");
        while (!isNum(aux));
        limites.setValor2((Double.parseDouble(aux)));
    }

    public void calculos() {

    }

    void resultados() {
        valor = (double) limites.getValor();
        valor2 = (double) limites.getValor2();
        String tipo =(String) limites.getTipo();
        p.setVisible(true);

        if (tipo.equals("c") || tipo.equals("C")) {
            while(valor <= valor2){
                a = (valor*1.8)+32;
                p.out(valor + " grados °C equivalen a " +a+ " Grados °F \n");

                valor ++;
            }
        }

        else if (tipo.equals("f") || tipo.equals("F")) {

            while(valor <= valor2){
                a = (valor-32)/1.8;
                p.out("\n"+valor + " grados °F equivalen a " +a+ " Grados °C \n");
                valor ++;
            }
            p.ofoto("tabla.jpg");
        }
    }
    public static void main(String[] args) throws IOException {
        LimitesTemperatura limitesTemperatura = new LimitesTemperatura ();
        String resp = "s";


        limitesTemperatura.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            limitesTemperatura.datos(limitesTemperatura.limites);
            limitesTemperatura.calculos();
            limitesTemperatura.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea calcular otro limite? s/n");
            System.in.skip(2);
        }
    }

}

package com.fernandaochoa.matrices;

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
//70
import cstio.Dialog;
import cstio.Pizarra;

import java.io.IOException;

public class OperacionesAritmeticas {
    Pizarra x = new Pizarra();



    public void inicio() {
        System.out.println("Para hacer calculos con matrices");
    }

    int [][] matriz1 =new int[25][25];
    int [][] matriz2 =new int [25][25];
    int [][] matriz3 = new int [25][25];
    int i=0,j=0,a,b,e,k,h;
    String o;

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


    public void datos() {
        Dialog d = new Dialog();
        String aux="";


        do aux = d.readString("Ingrese el tipo de operacion que deseas S/R/D (Suma,Resta,Division):");
        while (aux.isEmpty());
        o = aux;

        do aux = d.readString("Ingresa las filas de la matriz \n");
        while (!isNum(aux));
        k = Integer.parseInt(aux);

        do aux = d.readString("Ingresa las columnas de la matriz \n");
        while (!isNum(aux));
        e = Integer.parseInt(aux);

        for( i=0; i<k; i++){
            for (j=0; j<e; j++){


                do aux = d.readString("Ingresa el valor"+i+","+j+" de la primera matriz \n");
                while (!isNum(aux));
                a = Integer.parseInt(aux);
                matriz1[i][j]=a;
            }
        }

        for( i=0; i<k; i++){
            for (j=0; j<e; j++){

                do aux = d.readString("Ingresa el valor"+i+","+j+" de la segunda matriz \n");
                while (!isNum(aux));
                b = Integer.parseInt(aux);
                matriz2[i][j]=b;


            }
        }
    }

    public void calculos() {

        switch (o) {
            case "s":
            case "S":

                for( i=0; i<k; i++){
                    for (j=0; j<e; j++){
                        matriz3 [i][j]= matriz1[i][j]+matriz2[i][j];
                    }
                }

            case "r":
            case "R":

                for( i=0; i<k; i++){
                    for (j=0; j<e; j++){
                        matriz3 [i][j]= matriz1[i][j]-matriz2[i][j];
                    }
                }
            case "d":
            case "D":

                for( i=0; i<k; i++){
                    for (j=0; j<e; j++){
                        if( matriz2[i][j] ==0){

                            h=1;
                            break;
                        }

                        matriz3 [i][j]= matriz1[i][j]/matriz2[i][j];
                    }
                }
        }

    }




    void resultados() { //No. 3 Imprimir
        x.setVisible(true);
        if (h==1){
            x.out("se indetermina\n");
        }
        else {
            x.out("La nueva matriz es \n");
            for( i=0; i<k; i++){
                for (j=0; j<e; j++) {
                    x.out(" [ "+matriz3[i][j]+"]");
                }
                x.out("\n");

            }
            x.out("\n");
            x.ofoto("matriz.png");
        }
    }

    public static void main(String[] args) throws IOException {
        OperacionesAritmeticas a = new OperacionesAritmeticas ();
        String resp = "s";


        a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos();
            a.calculos();
            a.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea realizar otra operacion con matrices ? s/n");
            System.in.skip(2);
        }
    }

}

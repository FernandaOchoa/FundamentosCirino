package com.fernandaochoa.tareas;
/*Determinante.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Tarea #: ___9___
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

import cstio.Dialog;
import cstio.Pizarra;
import java.io.IOException;

public class Determinante {
    Pizarra x = new Pizarra();


    public void inicio() {
        System.out.println("Para calcular la determinante de una matriz");
    }

    int [][] matrix =new int[25][25];
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

        do aux = d.readString("Ingresa el tamaño de la matriz \n");
        while (!isNum(aux));
        k = Integer.parseInt(aux);

        for( i=0; i<k; i++){
            for (j=0; j<k; j++){

                do aux = d.readString("Ingresa el valor"+i+","+j+" de la matriz \n");
                while (!isNum(aux));
                a = Integer.parseInt(aux);
                matrix[i][j]=a;
            }
        }

    }


    public static double calculos(int b[][],int m)
    {
        int c[][]=new int[m][m];

        int i,j,k;
        double sum=0;
        if(m==1) { sum=b[0][0];  }
        else if(m==2)
        {
            sum=(( b[0][0]*b[1][1] ) - ( b[0][1]*b[1][0] ));
        }
        else
        {
            for(int p=0;p<m;p++)
            {
                int h=0;k=0;
                for(i=1;i<m;i++)
                {
                    for(j=0;j<m;j++)
                    {
                        if(j==p)
                            continue;
                        c[h][k]=b[i][j];
                        k++;
                        if(k==m-1)
                        {
                            h++;
                            k=0;
                        }
                    }
                }
                sum=sum+b[0][p]*Math.pow((-1),p)*calculos(c,m-1);
            }
        }
        return sum;
    }

    void resultados() {
        x.setVisible(true);

        for( i=0; i<k; i++){
            for (j=0; j<k; j++){
                x.out(matrix[i][j]+" ");           }
            x.out("\n");}

        x.out("determinante de la matriz "+calculos(matrix,k));
        x.out("\n");
        x.ofoto("gauss.png");
    }


    public static void main(String[] args) throws IOException {
        Determinante a = new Determinante ();
        String resp = "s";


        a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos();
            a.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea calcular otra determinante ? s/n");
            System.in.skip(2);
        }
    }

}



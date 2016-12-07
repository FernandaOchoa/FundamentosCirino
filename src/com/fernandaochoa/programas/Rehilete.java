package com.fernandaochoa.programas;

/**
 * Created by monsh on 06/12/2016.
 */
public class Rehilete {
    public static void main(String[] args) {
        for (int i=1; i<=20; i++){
            for (int j=1; j<=20; j++){
                if ((j<=i)&&(j<=5)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println(" ");
        }

    }

    public static void izquierdaArriba() {
        for (int i=1; i<=5; i++){
            for (int j=1; j<i+1;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public static void derechaArriba() {

        for (int i=5; i>0;i--){
            for (int j=1; j<i+1;j++){
                System.out.print(j);
            }
            System.out.println("");
        }

    }

    public static void izquierdaAbajo() {
        for (int i=1; i<=5;i++){
            for (int j=5; j>=1;j--){
                if (j>i) {
                    System.out.print(" ");
                }else
                    System.out.print(i);
            }
            System.out.println("");
        }
    }

    public static void derechaAbajo() {
        for (int i=1; i<=5;i++){
            for (int j=5; j>i-1;j--){
                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("");
    }


}


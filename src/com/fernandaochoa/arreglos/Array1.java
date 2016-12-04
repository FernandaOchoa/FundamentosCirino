package com.fernandaochoa.arreglos;

/**
 * Created by monsh on 04/12/2016.
 */
public class Array1 {
    public static void main(String[] args) {
        int anArray[] = new int[10];
        int anArray2[]= {1,2,3};
//For normal
        for (int i = 0; i < anArray2.length; i++) {
            System.out.println(i);
            for (int q=0; q< anArray2.length; q++){
                System.out.println(q);
            }
        }

        //For each
        for (int i : anArray2) {
            System.out.println(i);
        }
/*
        for(int i=0; i<anArray.length; i++){
            int tmp =Math.round((float)Math.random()*100000% 2147483647);
            anArray[i] = (int)tmp;

            System.out.println("A["+i+"]="+anArray[i]+",");
        }
        System.out.println();
    }

}
*/
    }
}

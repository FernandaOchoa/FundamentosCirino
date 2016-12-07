package com.fernandaochoa.arreglos;

public class ArrayDemoBoolean {
    public static void main(String[] args) {
        boolean anArray[];

        anArray = new boolean[10];

        for (int i = 0; i < anArray.length; i++) {
            boolean tmp = Math.random() > 0.5 ? true : false;
            anArray[i] = (boolean) tmp;

            System.out.println("A[" + i + "]=" + anArray[i] + ",");
        }
        System.out.println();
    }
}
/*
if (Math.random() > 0.5){
	anArray [i] = true;
else anArray[i] = false;
*/
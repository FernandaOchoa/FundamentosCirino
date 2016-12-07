package com.fernandaochoa.arreglos;

public class ArrayDemoInt {
    public static void main(String[] args) {

        int anArray[];

        anArray = new int[10];

        for (int i = 0; i < anArray.length; i++) {
            int tmp = Math.round((float) Math.random() * 100000 % 2147483647);
            anArray[i] = (int) tmp;

            System.out.println("A[" + i + "]=" + anArray[i] + ",");
        }
        System.out.println();
    }
}
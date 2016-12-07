package com.fernandaochoa.arreglos;

public class ArrayDemoLong {
    public static void main(String[] args) {
        long anArray[];

        anArray = new long[10];

        for (int i = 0; i < anArray.length; i++) {
            long tmp = Math.round((float) Math.random() * 100000 % 9e18);
            anArray[i] = (long) tmp;

            System.out.println("A[" + i + "]=" + anArray[i] + ",");
        }
        System.out.println();
    }
}
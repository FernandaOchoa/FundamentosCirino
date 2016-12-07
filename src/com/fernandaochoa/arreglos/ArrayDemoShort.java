package com.fernandaochoa.arreglos;

public class ArrayDemoShort {
    public static void main(String[] args) {
        short anArray[];

        anArray = new short[10];

        for (int i = 0; i < anArray.length; i++) {
            int tmp = Math.round((float) Math.random() * 100000 % 32767);
            anArray[i] = (short) tmp;

            System.out.println("A[" + i + "]=" + anArray[i] + ",");
        }
        System.out.println();
    }
}
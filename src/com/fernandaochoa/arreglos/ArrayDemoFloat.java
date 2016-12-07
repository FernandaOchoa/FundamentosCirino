package com.fernandaochoa.arreglos;

public class ArrayDemoFloat {
    public static void main(String[] args) {
        float anArray[];

        anArray = new float[10];

        for (int i = 0; i < anArray.length; i++) {
            float tmp = Math.round((float) Math.random() * 100000 % 3.40282e38);
            anArray[i] = (float) tmp;

            System.out.println("A[" + i + "]=" + anArray[i] + ",");
        }
        System.out.println();
    }
}
package com.company;


public class Main /*extends Helper */ {

    public static void main(String[] args) {
        // Integer[] array = new Integer[]{5};

        DynamicIntArray numbers2 = new DynamicIntArray();
        numbers2.addToArray(34);
        numbers2.addToArray(44);
        numbers2.addToArray(54);
        numbers2.addToArray(64);
        numbers2.addToArray(74);
        numbers2.addToArray(44);
        numbers2.printNumbers();
        numbers2.removeFromArray(3);
        System.out.print(" Remove from array  - ");
        numbers2.printNumbers();
        numbers2.swap(2, 78);
        System.out.print(" Swap to array   -  ");
        numbers2.printNumbers();
        numbers2.update(44, 77);
        System.out.print(" Update array   -  ");
        numbers2.printNumbers();
    }
}

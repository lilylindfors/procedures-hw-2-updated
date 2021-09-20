package com.company;

public class Main {

    public static void main(String[] args) {
	int[] VALUES = { 4, 12, 5, -6, 10};
        System.out.println(contains(VALUES, 5));
    }
    static boolean contains (int[] array, int value) {
        for (int v : array) {
            if (v == value) return true;
        }
        return false;
    }
}

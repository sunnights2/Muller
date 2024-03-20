package com.day05;

public class Array01 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        int number = array[3];
        System.out.println(number);
        System.out.println(array[3]);

        array[3] = 10;
        System.out.println(array[3]);
    }
}

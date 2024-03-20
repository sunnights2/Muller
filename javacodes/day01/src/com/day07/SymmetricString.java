package com.day07;

import java.util.Scanner;

public class SymmetricString {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String str = arrToSting(arr);
        System.out.println(str);
    }

    public static String arrToSting(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            }
            sb.append(arr[i]).append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

}


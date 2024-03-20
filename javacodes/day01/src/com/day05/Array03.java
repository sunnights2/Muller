package com.day05;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        // 给数组赋值
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个元素");
            arr[i] = scanner.nextInt();
            //将数组值打印到控制台
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println("arr[" + i + "]=" + arr[i]);
        }
    }
}

package com.day04;

import java.util.Scanner;

public class IfPractice02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入ming的名次：");
        int b = scanner.nextInt();
        if (b == 1){
            System.out.println("ming获得了女朋友");
        }else {
            System.out.println("幺幺获得了女朋友");
        }
    }
}

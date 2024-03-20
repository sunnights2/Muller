package com.day04;

import java.util.Scanner;

public class IfPractice03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的金额：");
        int m = scanner.nextInt();
        if (m > 100){
            System.out.println("吃大酒店");
        }else {
            System.out.println("吃沙县小吃");
        }
    }
}

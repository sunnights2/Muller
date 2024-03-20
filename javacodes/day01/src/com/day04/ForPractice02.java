package com.day04;

import java.util.Scanner;

public class ForPractice02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入起始值：");
        int start = scanner.nextInt();
        System.out.println("请输入结束值：");
        int end = scanner.nextInt();
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                count++;
            }
        }
        System.out.println("有"+count+"个数");
    }
}

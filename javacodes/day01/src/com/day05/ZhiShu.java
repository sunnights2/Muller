package com.day05;

import java.util.Scanner;

public class ZhiShu {
    public static void main(String[] args) {
        //输入一个整数，判断是否为质数。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = scanner.nextInt();
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(num + "是质数");
        } else {
            System.out.println(num + "不是质数");
        }
    }
}

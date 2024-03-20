package com.iflytek;

import java.util.Scanner;

public class ArithmeticOperator01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int num = scanner.nextInt();
        int one = num % 10;
        int ten =  num / 10 % 10;
        int hundred = num / 100;
        System.out.println("百位是：" + hundred + "，十位是：" + ten + "，个位是：" + one);

    }
}

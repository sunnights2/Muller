package com.day05;

import java.util.Scanner;

public class PingFang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++){
            if (i * i == num){
                System.out.println(num + "的平方根是" + i);
                break;
            }else if (i * i > num){
                System.out.println(num + "的平方根的整数部分是" + (i - 1));
                break;
            }
        }
    }
}

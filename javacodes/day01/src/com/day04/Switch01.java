package com.day04;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        //编写一个程序，用switch语句，记录一周的减肥活动
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        switch (d){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("动感单车");
                break;
            case 4:
                System.out.println("拳击");
                break;
            case 5:
                System.out.println("爬山");
                break;
            case 6:
                System.out.println("胡吃海喝");
                break;
            case 7:
                    System.out.println("胡吃海喝");
            default:
                System.out.println("没有此日");
        }
    }
}

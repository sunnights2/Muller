package com.day04;

import java.util.Scanner;

public class IfPractice05 {
    public static void main(String[] args) {
        // 编写一个程序，给小米不同分数给予不同的奖励
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入小米的分数：");
        int score = scanner.nextInt();
        if(score>=90 && score<=100){
            System.out.println("奖励：哈苏相机");
        }else if(score>=80 && score<=89){
            System.out.println("奖励：大餐");
        }else if (score>=70 && score<=79){
            System.out.println("奖励：iphone12");
        }else if (score>=60 && score<=69){
            System.out.println("奖励：ipad");
        }else{
            System.out.println("奖励：大嘴巴子");
        }
    }
}

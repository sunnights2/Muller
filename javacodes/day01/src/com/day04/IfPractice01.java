package com.day04;

import java.util.Scanner;

public class IfPractice01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入女婿酒量：");
        int a = sc.nextInt();
        if (a>=20){
            System.out.println("你喝多了");
        }
        else {
            System.out.println("你还没醉");
        }
    }
}

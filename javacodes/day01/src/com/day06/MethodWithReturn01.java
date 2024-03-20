package com.day06;

import java.util.Scanner;

public class MethodWithReturn01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个⚪的半径：");
        int r1 = scanner.nextInt();
        System.out.println("请输入另一个⚪的半径：");
        int r2 = scanner.nextInt();
        double a1 = getArea(r1);
        double a2 = getArea(r2);
        if(a1>a2){
            System.out.println(a1);
        }else {
            System.out.println(a2);
        }
    }

    public static double getArea(int r) {
        double s = 3.14*r*r;
        return s;
    }
}

package com.day07;

import java.util.Scanner;

public class MobileEncode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入手机号：");
        String str = scanner.next();
        String str1 = numPhone(str);
        System.out.println(str1);
    }
    public static String numPhone(String str) {
        String num = "";
        String start = str.substring(0,3);
        String end = str.substring(7);
        return start+"****"+end;
    }
}

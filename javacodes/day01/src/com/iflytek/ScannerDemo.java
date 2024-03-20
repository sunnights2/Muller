package com.iflytek;
import  java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        // 创建Scanner对象;
        Scanner sc = new Scanner(System.in); // 接收数据。键盘录入一个数字之后被num接收。
        System.out.println("请输入姓名：");
        String name = sc.next(); // 接收字符串数据
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("请输入身高：");
        double height = sc.nextDouble();
        System.out.println("请输入爱好：");
        String hobby = sc.next();
        System.out.println("你是：" + name + "，今年：" + age + "岁，身高：" + height + "cm，爱好：" + hobby + "。");
    }
}

package com.day10;

public class Demo04 {
    public static void main(String[] args) {
        // 调用子类有参数构造方法
        Student1 s4 = new Student1("张三", 20, 99);
        System.out.println(s4.getScore()); // 99
        System.out.println(s4.getName()); // 输出 张三
        System.out.println(s4.getAge()); // 输出 20
    }
}

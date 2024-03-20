package com.day08;

public class StaticProp {
    // 实例变量
    public String name;
    public static String schoolName = "西亚斯学院"; // 属于类，只有一份。

    // 2.方法：行为
    // 无 static修饰，实例方法。属于每个对象，必须创建对象调用
    public void run() {
        System.out.println(schoolName + name + "热爱跑步");
    }

    // 无 static修饰，实例方法
    public void sleep() {
        System.out.println(schoolName + name + "喜欢睡觉");
    }

    public static void study() {
        System.out.println("学生爱学习");
    }
}
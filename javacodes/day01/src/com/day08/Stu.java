package com.day08;

public class Stu {
    private String name;
    private int age;

    //构造方法
    public Stu() {
        System.out.println("无参构造方法");
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}


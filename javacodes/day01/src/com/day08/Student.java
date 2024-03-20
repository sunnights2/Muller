package com.day08;

public class Student {
    private String name;
    private int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //提供get/set方法
//    public void setAge(int a) {
//        if (a < 0 || a > 120) {
//            System.out.println("你给的年龄有误");
//        } else {
//            age = a;
//        }
//    }
//
//    public int getAge() {
//        return age;
//    }

    //成员方法
    public void show() {
        System.out.println(name + "," + age);
    }
}


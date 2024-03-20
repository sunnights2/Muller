package com.day10;

public class Person1 {
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

    public Person1() {
        System.out.println("无参构造方法");
    }

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

package com.day10;

public class Person2 {
    private String name = "凤姐";
    private int age = 20;
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person2() {
        System.out.println("父类无参");
    }
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
}
class Student1 extends Person2 {
    private double score = 100;

    public Student1(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public Student1(){
        System.out.println("子类无参");}

    public double getScore() {
        return score;
    }
}


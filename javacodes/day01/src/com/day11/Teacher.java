package com.day11;

public class Teacher extends Person{
    @Override
    public void show() {
        System.out.println("老师姓名是"+getName()+",年龄是"+getAge());
    }

}

package com.day11;

public class Adminastrator extends Person{
    @Override
    public void show() {
        System.out.println("管理员姓名是"+getName()+",年龄是"+getAge());
    }
}

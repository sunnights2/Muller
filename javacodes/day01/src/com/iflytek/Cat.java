package com.iflytek;

public class Cat extends Animal{
    public Cat() {
    }

    // 需要带子类和父类中所有的属性
    public Cat(String name, int age, String color) {
        super(name, age, color);
    }
}


package com.test1;

public class Cat extends Animal{
    public Cat() {

    }
    public Cat(String color, int age) {
        super(age,color);
    }
    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的猫眯着眼睛侧着头吃" + something);
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }

}

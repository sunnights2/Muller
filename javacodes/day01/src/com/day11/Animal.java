package com.day11;

public class Animal {public void eat() {
    System.out.println("动物吃东西！");
}
}

class Cat extends Animal {
    public void eat() {
        System.out.println("吃鱼");
    }

    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("吃骨头");
    }

    public void watchHouse() {
        System.out.println("看家");
    }
}
package com.day10;

class Animal {
    public void run() {
    System.out.println("动物跑的很快！");
}

    public void cry() {
        System.out.println("动物都爱叫~~~");
    }
}

class Cat extends Animal {
    @Override
    public void cry() {
        System.out.println("我们一起学猫叫，喵喵喵！喵的非常好听！");
    }
}


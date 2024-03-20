package com.day09;

public class Fu3 {
    public void show() {
        System.out.println("Fu show");
    }
}

class Zi4 extends Fu3 {
    // 子类重写了父类的show方法
    public void show() {
        System.out.println("Zi show");
    }
}


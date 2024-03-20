package com.day09;

public class Fu2 {

    public void show() {
        System.out.println("Fu类中的show方法执行");
    }
}

class Zi3 extends Fu2 {
    public void show2() {
        System.out.println("Zi类中的show2方法执行");
    }
}

class Demo03 {
    public static void main(String[] args) {
        Zi3 z = new Zi3();
        // 子类中没有show方法，但是可以找到父类方法去执行
        z.show();
        z.show2();
    }
}


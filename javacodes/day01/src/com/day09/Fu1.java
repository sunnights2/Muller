package com.day09;

public class Fu1 {

    // Fu中的成员变量。
    int num = 5;
}

class Zi2 extends Fu1 {
    // Zi中的成员变量
    int num = 6;

    public void show() {
        int num = 1;

        // 访问方法中的num
        System.out.println("method num=" + num);
        // 访问子类中的num
        System.out.println("Zi num=" + this.num);
        // 访问父类中的num
        System.out.println("Fu num=" + super.num);
    }
}

class Demo02 {
    public static void main(String[] args) {
        // 创建子类对象
        Zi2 z2 = new Zi2();
        // 调用子类中的show方法
        z2.show();
    }
}


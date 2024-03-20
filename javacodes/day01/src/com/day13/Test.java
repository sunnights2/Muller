package com.day13;

public class Test {
    public static void main(String[] args) {
        //  外部类对象。
        // Outer out = new Outer();
        // 创建内部类对象。
        Outer.Inner oi = new Outer().new Inner();
        oi.method();
    }
}

class Outer {
    public class Inner{
        public void method(){
            System.out.println("内部类中的方法被调用了");
        }
    }
}
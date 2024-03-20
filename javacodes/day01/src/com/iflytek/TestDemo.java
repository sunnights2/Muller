package com.iflytek;

public class TestDemo {
    public static void main(String[] args) {
            // Animal ： 姓名，年龄，颜色
            // Cat :
            // Dog ：吼叫

            // 创建狗的对象
            Dog d = new Dog("spacky", 2, "黄色", "狂吠");
            System.out.println(d.getName() + ", " + d.getAge() + ", " + d.getColor() + ", " + d.getWang());

            // 创建猫的对象
            Cat c = new Cat("Tom", 1, "蓝色");
            System.out.println(c.getName() + ", " + c.getAge() + ", " + c.getColor());
        }
    }


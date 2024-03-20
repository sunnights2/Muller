package com.test1;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("王奔",28);
        Dog d = new Dog(2,"brown");
        p1.keepPet(d, "骨头");

        Person p2 = new Person("刘宸",8);
        Cat c = new Cat("blue",1);
        p2.keepPet(c,"fish");

        Person p3 = new Person("老王", 30);
        Dog d3 = new Dog(2, "黑");
        Cat c3 = new Cat("white", 1);
        p3.keepPet(d3, "骨头");
        p3.keepPet(c3, "鱼");
    }
}

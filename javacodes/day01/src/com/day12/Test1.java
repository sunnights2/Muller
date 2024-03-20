package com.day12;

public class Test1 {
    public static void main(String[] args) {
        //Employee employee = new Employee();
        Manager m = new Manager();
        m.work();

        Cook c = new Cook("ap002", "懒羊羊", 1);
        c.work();
    }
}
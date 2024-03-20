package com.day12;

public class Employee {
    private String id;
    private String name;
    private Double salary;

    public void work()//抽象方法
    {

    }

    public Employee() {
    }
    public Employee(String id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


}

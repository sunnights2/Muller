package com.day09;

public class Teacher extends Person{
    public int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void teach(){
        System.out.println("传道授业");
    }
}

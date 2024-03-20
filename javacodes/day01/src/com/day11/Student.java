package com.day11;

public class Student extends Person
{
    //重写父类的方法
    @Override
    public void show()
    {
        System.out.println("学生姓名："+ getName() + "\t年龄："+getAge());
    }
}




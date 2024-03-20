package com.day09;

public class Test01 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("张三");
        stu.setAge(20);
        System.out.println(stu.getName() + "," + stu.getAge());
        stu.eat();
        stu.sleep();
        Teacher t = new Teacher();
        t.setName("李四");
        t.setAge(30);
        t.setSalary(2000);
        System.out.println(t.getName() + "," + t.getAge());
        t.eat();
        t.teach();
        Master  m = new Master();
        m.setName("王五");
        m.setAge(40);
        System.out.println(m.getName() + "," + m.getAge());
        m.eat();
        m.manage();
    }

}

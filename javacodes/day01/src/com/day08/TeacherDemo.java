package com.day08;

public class TeacherDemo {
    public static void main(String[] args) {
        Teacher t = new Teacher("张阳",18,"大数据技术");
        t.show();
        t.setName("送小号");
        t.setAge(30);
        t.setSubject("NOSQL数据库");
        t.show();
    }
}

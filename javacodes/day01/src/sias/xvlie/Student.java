package sias.xvlie;

import java.io.Serializable;

public class Student implements Serializable{
    private static final long serialVersionUID = 6395770827060751151L;
    private String name;
    private String address;
    public String getName() {
        return name;
    }

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
}

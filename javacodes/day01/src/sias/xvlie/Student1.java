package sias.xvlie;

import java.io.Serializable;

public class Student1 implements Serializable{
    private static final long serialVersionUID = -5797926953140314619L;
    private String name;
    private int age;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

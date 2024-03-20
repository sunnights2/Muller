package sias.Bean;

public class Student2 {
    private String name;
    private int age;

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student2() {
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

    @Override
    public String toString() {
        System.out.println(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


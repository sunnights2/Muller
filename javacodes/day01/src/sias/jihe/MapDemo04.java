package sias.jihe;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

class Student1 {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return age == student1.age && Objects.equals(name, student1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Student1() {
    }

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
public class MapDemo04{
    public static void main(String[] args) {
        HashMap<Student,String> hm = new HashMap<Student,String>();

        Student s1 = new Student("张三",20);
        Student s2 = new Student("张四",27);
        Student s3 = new Student("张五",28);
        Student s4 = new Student("张柳",22);

        hm.put(s1,"北京");
        hm.put(s2,"甘孜");
        hm.put(s3,"亚丁");
        hm.put(s4,"哥本哈根");
        Set<Student> keyset = hm.keySet();
        for (Student student : keyset) {
            String value = hm.get(student);
            System.out.println(student.getName()+"---"+student.getAge()+"---"+value);
        }
    }
}

package sias.list;

import com.day08.Stu;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {

    ArrayList<Student> array = new ArrayList<>();

    Student s1 = new Student("林青霞", 30);
    Student s2 = new Student("风清扬", 33);
    Student s3 = new Student("柳如风", 18);
        array.add(s1);
        array.add(s2);
        array.add(s3);
    //遍历
        for (int i = 0; i < array.size(); i++) {
        Student s = array.get(i);
        System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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

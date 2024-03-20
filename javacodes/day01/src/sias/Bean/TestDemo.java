package sias.Bean;

public class TestDemo {
    public static void main(String[] args) {
        // 测试代码
        Student student = new Student();
        student.setName("张三");
        student.setAge(20);
        System.out.println("姓名：" + student.getName() + "，年龄：" + student.getAge());
    }
}

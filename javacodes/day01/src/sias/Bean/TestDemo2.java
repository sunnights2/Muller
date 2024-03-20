package sias.Bean;

// 测试类
public class TestDemo2 {
    public static void main(String[] args) {
        // 创建两个学生对象
        Student2 s1 = new Student2("iflytek", 14);
        Student2 s2 = new Student2("iflytek", 14);

        // 比较两个对象是否相等
//        System.out.println(s1 == s2); // false
         System.out.println(s1.equals(s2)); // false

    }
}
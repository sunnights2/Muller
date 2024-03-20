package com.day08;

public class StaticPropTest {
    public static void main(String[] args) {
    // 创建对象
    StaticProp stu1 = new StaticProp();
    StaticProp stu2 = new StaticProp();

    stu1.name = "徐峥";
    stu2.name = "黄渤";
    // Student.sleep();// 报错，必须用对象访问。
    stu1.sleep();
    stu1.run();

    stu2.sleep();
    stu2.run();
    // 静态方法，使用类调用
    StaticProp.schoolName = "郑州大学";
    StaticProp.study();

    // 修改完schoolName属性之后，所有对象的schoolName值都变了
    stu1.sleep();
    stu2.sleep();
}
}
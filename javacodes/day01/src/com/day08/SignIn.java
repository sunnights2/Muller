package com.day08;

public class SignIn {
    public static void main(String[] args) {
        Sign user1 = new Sign();
        user1.setUsername("lisi");
        user1.setPassword("123456");
        user1.setEmail("lisi@qq.com");
        user1.setGender(true);
        user1.setAge(20);
        user1.show();
    }
}

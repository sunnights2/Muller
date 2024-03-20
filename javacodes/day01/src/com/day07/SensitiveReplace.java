package com.day07;

public class SensitiveReplace {
    public static void main(String[] args) {
        String str = "后裔你玩什么啊，TMD";
        String str1 = replace(str);
        System.out.println(str1);
    }

    public static String replace(String str) {
        String start = str.replace("TMD", "***");
        return start;
    }
}
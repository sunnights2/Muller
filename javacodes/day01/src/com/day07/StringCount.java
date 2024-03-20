package com.day07;

import java.util.Scanner;

public class StringCount  {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();
        //使用for循环遍历字符串
        //统计大写字母出现的次数
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch>='A'&&ch<='Z'){
                count++;
            }
        }
        //统计小写字母出现的次数
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch>='a'&&ch<='z'){
                count1++;
            }
        }
        //统计数字出现的次数
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch>='0'&&ch<='9'){
                count2++;
            }
        }
        System.out.println("大写字母出现的次数为："+count);
        System.out.println("小写字母出现的次数为："+count1);
        System.out.println("数字出现的次数为："+count2);
    }
}

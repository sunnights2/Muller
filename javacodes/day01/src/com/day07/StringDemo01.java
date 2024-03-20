package com.day07;

public class StringDemo01 {
    public static void main(String[] args) {
        String s1 = new String("s1");
        System.out.println(s1);

        byte[] bys = {97, 98, 99};
        String s3 = new String(bys);
        System.out.println("s3:" + s3);
    }
}

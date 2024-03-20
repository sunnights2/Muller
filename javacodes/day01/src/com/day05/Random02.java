package com.day05;

public class Random02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            //2.判断每一个数字，如果符合规则，就打印过，如果不符合规则就打印真实的数字
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.println("过");
                continue;
            }
        System.out.println(i);
    }
}
}

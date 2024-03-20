package com.day05;

import java.util.Random;

public class Random01 {
    public static void main(String[] args) {
        Random random = new Random();
        //生成一个4位随机数，
        int num = random.nextInt(10000);
         num = num % 10000 + 1000;
        System.out.println(num);
    }

}

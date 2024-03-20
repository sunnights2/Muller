package com.day05;

import java.util.Random;

public class Array08 {
    public static void main(String[] args) {
        // 定义一个数组，存储10个随机数字，然后求出所有元素的平均值
        int[] arr = new int[10];
        Random random = new Random();
        // 给数组赋值
        for (int i = 0; i < arr.length; i++) {
            int num = random.nextInt(100)+1;
            arr[i] = num;
            // 打印随机数字
            System.out.println(num);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("数组和是" + sum);
        // 计算平均值
        double avg = (double) sum / arr.length;
        System.out.println("平均值是：" + avg);
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < avg){
                count++;
            }
        }
        System.out.println("有"+ count+"个数字小于平均值");
    }
}

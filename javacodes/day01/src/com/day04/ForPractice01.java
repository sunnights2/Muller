package com.day04;

public class ForPractice01 {
    public static void main(String[] args) {
        // 在控制台1-100求和
        int sum = 0;
        //从1开始到5结束的数据，使用循环结构完成
        for (int i = 1; i <= 100; i++) {
            //将反复进行的事情写入循环结构内部
            // 此处反复进行的事情是将数据 i 加到用于保存最终求和的变量 sum 中
            sum = sum + i;
        }
        //当循环执行完毕时，将最终数据打印出来
        System.out.println("1-100之间的数据和是：" + sum);
    }
}


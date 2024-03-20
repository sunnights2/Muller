package com.day06;

public class MethodWithReturn {
    public static void main(String[] args) {
        int s1 =  getSum(10, 20, 30);
        int s2 = getSum(100, 200, 300);
        int s3 = getSum(1000, 2000, 3000);

        int Sum = s1 + s2 + s3;
        System.out.println("全年总和是：" + Sum);
    }

    public static int getSum(int m1, int m2, int m3) {
        int sum = m1 + m2 + m3;
        return sum;
    }
}

package com.day05;

public class Array04 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("数组元素的和为：" + sum);
    }
}

package com.day05;

public class Array07  {
    public static void main(String[] args){
        int[] arr = {33,5,22,44,55};
        //求数组中的最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
        //求最小值
        int min = arr[0];

    }

}

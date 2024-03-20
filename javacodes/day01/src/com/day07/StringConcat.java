package com.day07;

public class StringConcat {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        String str = arrToString(arr);
        System.out.println(str);
    }

    public static String arrToString(int[] arr) {
        String s = "";
        s = s + "[";
        for (int i = 0; i < arr.length; i++){
            if (i == arr.length - 1) {
                s = s +arr[i];
            }else {
                s = s + arr[i]+",";
            }
        }
            return  s + "]";
    }
}

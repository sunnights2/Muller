package com.day04;

public class WhilePractice02 {
    public static void main(String[] args) {
        int h = 8848000;
        double p = 0.1;
        int count = 0;
        while (p < h){
            p *= 2;
            count++;
        }
        System.out.println("需要"+count+"次");
    }
}

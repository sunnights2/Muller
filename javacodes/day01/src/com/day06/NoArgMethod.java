package com.day06;

import java.util.Scanner;

public class NoArgMethod {
    public static void main(String[] args) {
        getmax();
    }
    public static void getmax() {
       int a = 10;
       int b = 20;

       if (a>b){
           System.out.println(a);
       }else {
           System.out.println(b);
       }
    }
}

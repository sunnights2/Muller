package com.iflytek;

public class Variable_Pratice01
{
    public static void main(String[] args)
    {
        // 定义一个变量并赋值
        int a = 0;//车上0乘客
        System.out.println("车上有" + a +"名乘客");
        a = a + 1;//车上1乘客
        System.out.println("车上有" + a +"名乘客");
        a = a + 2 - 1;//车上2乘客,下1乘客
        System.out.println("车上有" + a +"名乘客");
        a = a + 2 - 1;//车上2乘客,下1乘客
        System.out.println("车上有" + a +"名乘客");
        a = a - 1;//车上2乘客,下1乘客
        System.out.println("车上有" + a +"名乘客");
        a = a + 1;//车上2乘客,下1乘客
        System.out.println("终点站有" + a +"名乘客");
    }
}

package com.day07;

import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        String user = "muller";
        String pwd = "123456";

        for (int i = 0; i < 3; i++){
            System.out.println("请输入用户名：");
            String user1 = new Scanner(System.in).nextLine();
            System.out.println("请输入密码：");
            String pwd1 = new Scanner(System.in).nextLine();
            if(user1.equals(user) && pwd1.equals(pwd)){
                System.out.println("登录成功");
                break;
            }else{
                if (i == 2){
                    System.out.println("登录次数用完，账户锁定");
                }else {
                    System.out.println("用户或密码错误，你还有"+(2-i)+"次机会");
                }
            }
        }
    }
}

package com.day07;

import java.util.Scanner;

public class IdCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入身份证号码：");
        String idCard = scanner.nextLine();

        String province = idCard.substring(0, 2);
        String city = idCard.substring(2, 4);
        String district = idCard.substring(4, 6);
        String birthDate = idCard.substring(6, 14);
        char gender = idCard.charAt(16);
        System.out.println("省份：" + province);
        System.out.println("城市：" + city);
        System.out.println("区县：" + district);
        System.out.println("人物信息为：");
        System.out.println("出生年月日:" + birthDate);
        int a = gender;
        if ( a % 2 == 0){
            System.out.println("women");
        }else {
            System.out.println("man");
        }
    }
}

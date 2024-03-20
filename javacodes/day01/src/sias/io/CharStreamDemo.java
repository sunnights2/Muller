package sias.io;

import javax.sound.midi.Soundbank;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名: ");
        String name = sc.next();
        System.out.println("请输入密码: ");
        String pwd = sc.next();
        FileWriter fw = new FileWriter(".\\day02\\b.txt");
        fw.write(name);
        fw.write("\r\n");
        fw.write(pwd);
        fw.flush();
        fw.close();
        System.out.println("注册成功");
        sc.close();
    }
}

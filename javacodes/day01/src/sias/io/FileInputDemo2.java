package sias.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputDemo2 {
    public static void main(String[] args) throws IOException {
        // 创建FileInputStream对象
        FileInputStream fis = new FileInputStream(".\\day02\\b.txt");
            // 读取并打印字节
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
            // 关闭流
        fis.close();
    }
}

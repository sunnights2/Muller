package sias.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter(".\\day02\\b.txt");

        // void write(int c)：写一个字符
         fw.write(97);
         fw.write(98);
         fw.write(99);

        char[] chs = {'a', 'b', 'c', 'd', 'e'};
         fw.write(chs);

         fw.write(chs, 0, chs.length);
         fw.write(chs, 1, 3);

//         void write(String str)：写一个字符串
         fw.write("abcde");

//         void write(String str, int off, int len)：写一个字符串的一部分
         fw.write("abcde", 0, "abcde".length());
        fw.write("abcde", 1, 3);

        // 释放资源
        fw.close();
    }
}


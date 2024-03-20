package sias.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo1 {
    public static void main(String[] args) throws IOException {
        // 创建FileOutput对象，指定输出文件和编码
        FileOutputStream fos = new FileOutputStream(".\\day02\\b.txt");

        // 写入字符串
        fos.write(97);
        fos.write(98);

        byte[] bytes = "abcd".getBytes();
        fos.write(bytes);

        fos.write(bytes,1,3);
        // 关闭FileOutput对象
        fos.close();
    }
}

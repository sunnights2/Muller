package sias.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo2 {
	public static void main(String[] args)  throws IOException {
        // 创建一个文件输出流，用于将数据写入到文件中。
        FileOutputStream fos = new FileOutputStream(".\\day02\\b.txt", true);

        for (int i = 0; i < 10; i++){
            fos.write("Hello, World! " .getBytes());
            fos.write("\r\n".getBytes());
        }
    }
}

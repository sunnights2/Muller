package sias.io;

import java.io.*;

public class CopyDemo1 {

	public static void main(String[] args) throws IOException {
        method2();
    }

    // 字节缓冲流一次读写一个字节
    public static void method1() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(""));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(""));

        int by;
        while ((by = bis.read()) != -1) {
            bos.write(by);
        }

        bos.close();
        bis.close();
    }

    // 字节缓冲流一次读写一个字节数组
    public static void method2() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(""));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(""));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }

        bos.close();
        bis.close();
    }
}
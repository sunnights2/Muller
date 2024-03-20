package sias.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileJpgDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(".\\day02\\sc1.jpg");
        FileOutputStream fos = new FileOutputStream(".\\day02\\src\\main\\sc2.jpg");

        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }
        fos.close();
        fis.close();
    }
}

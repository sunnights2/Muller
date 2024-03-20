package sias.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTxtDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(".\\day02\\b.txt");
        FileOutputStream fos = new FileOutputStream(".\\day02\\c.txt");

        int by;
        while ( (by = fis.read()) != -1 ) {
            fos.write(by);
        }
        fis.close();
        fos.close();
    }
}

package sias.io;

import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(".\\day02\\b.txt");
        char[] chs = new char[1024];
        int len;
        while ((len=fr.read(chs)) !=-1){
            System.out.print(new String(chs, 0, len));
        }
        fr.close();
    }
}

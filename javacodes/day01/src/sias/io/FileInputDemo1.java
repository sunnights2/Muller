package sias.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputDemo1 {
    
	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream(".\\day02\\b.txt");
        fos.write(1);
        fos.write(98);
        fos.close();
	}
}

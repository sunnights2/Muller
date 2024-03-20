package sias.xvlie;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class ObjectDemo01 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(".\\day02\\object.txt"));
        Student s = new Student("微子启", 21);
        oos.writeObject(s);
        oos.close();
    }
}

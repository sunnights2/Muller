package sias.xvlie;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectDemo02 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(".\\day02\\a.txt"));
        Object obj = ois.readObject();
        ArrayList<Student1> arrayList = (ArrayList<Student1>) obj;
        ois.close();
        for (Student1 s : arrayList) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}


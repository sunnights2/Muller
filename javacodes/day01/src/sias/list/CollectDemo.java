package sias.list;

import java.util.ArrayList;

public class CollectDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        for (String s : list){
            System.out.println(s);
        }
    }
}

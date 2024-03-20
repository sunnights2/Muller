package sias.list;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("微子启");
        array.add("柳如风");
        array.add("风清扬");
        System.out.println(array.size());
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            System.out.println(s);
        }
    }
}

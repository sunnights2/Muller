package sias.io;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) throws IOException {
        String s = "中国";
        byte[] bys = s.getBytes("GBK"); //[-42, -48, -71, -6]
        System.out.println(Arrays.toString(bys));

        // String ss = new String(bys);
        // String ss = new String(bys,"UTF-8");
        String ss = new String(bys, "GBK");
        System.out.println(ss);
    }
}

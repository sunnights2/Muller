package sias.baozhuang;

public class InterDemo01 {
    public static void main(String[] args) {
        String str1 = Integer.toBinaryString(100);
        System.out.println(str1);
        String str2 = Integer.toHexString(100);
        System.out.println(str2);
        String str3 = Integer.toOctalString(100);
        System.out.println(str3);

        int i = Integer.parseInt("100");
        System.out.println(i);
        System.out.println(i+1);
        String str = "true";
        boolean b = Boolean.parseBoolean(str);
        System.out.println(b);
    }
}

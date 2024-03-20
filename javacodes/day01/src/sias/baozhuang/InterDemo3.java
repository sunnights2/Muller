package sias.baozhuang;

public class InterDemo3 {
    public static void main(String[] args) {
        Integer i3 = Integer.valueOf(123);
        Integer i4 = Integer.valueOf("123");
        Integer i5 = Integer.valueOf("123", 8);

        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);

        Integer i6 = Integer.valueOf(127);
        Integer i7 = Integer.valueOf(127);
        System.out.println(i6 == i7);//true

        Integer i8 = Integer.valueOf(128);
        Integer i9 = Integer.valueOf(128);
        System.out.println(i8 == i9);
    }
}

package sias.fanxing;

 class Generic02 {
     public <T> void show(T t) {
         System.out.println(t);
     }
 }

public class _02_GenericDemo {
    public static void main(String[] args) {
        Generic02 g = new Generic02();
        g.show("柳如风");
        g.show(30);
        g.show(true);
        g.show(12.34);
    }
}


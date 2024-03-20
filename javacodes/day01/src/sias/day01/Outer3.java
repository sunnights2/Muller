package sias.day01;

public class Outer3 {
    int b = 20;
    public void show(){
        int a = 10;
        class Inner{
            String name;
            int age;
            public void fangfa(){
                System.out.println(b);
                System.out.println(a);
                System.out.println("方法");
            }
        }
        Inner inner = new Inner();
        System.out.println(inner.name);
        System.out.println(inner.age);
        inner.fangfa();
    }
}
class Demo3{
    public static void main(String[] args) {
        Outer3 outer3 = new Outer3();
        outer3.show();
    }
}

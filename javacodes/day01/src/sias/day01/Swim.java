package sias.day01;

public interface Swim {
    void swimming();
    //public abstract void swimming();
}
class Student implements Swim{
    @Override
    public void swimming() {
        System.out.println("蝴蝶泳");
    }
}

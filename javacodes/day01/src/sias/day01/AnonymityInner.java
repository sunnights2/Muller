package sias.day01;

public class AnonymityInner {
    public static void main(String[] args) {
        new Swim1() {
            @Override
            public void swimming() {
                System.out.println("自由泳");
            }
        }.swimming();
        // 输出：自由泳
        Swim1 s2 = new Swim1() {
            @Override
            public void swimming() {
                System.out.println("蛙泳");
            }
        };
        s2.swimming();
    }
}

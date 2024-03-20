package sias.day01;

public class Outer2 {
    private static  final String sc_name = "sias";
    public static class  Inner2 {
        private final String name;
        public Inner2(String name){
            this.name = name;
        }
        public void showName(){
            System.out.println(this.name);
            System.out.println(sc_name);
        }
    }
}

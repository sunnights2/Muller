package sias.api;

public class MathDemo01 {
    public static void main(String[] args) {
        System.out.println("-2的绝对值为：" + Math.abs(-2));
        System.out.println("2的绝对值为：" + Math.abs(2));
        System.out.println("大于或等于23.45的最小整数位：" + Math.ceil(23.45));
        System.out.println("大于或等于-23.45的最小整数位：" + Math.ceil(-23.45));
        System.out.println("小于或等于23.45的最大整数位：" + Math.floor(23.45));
        System.out.println("小于或等于-23.45的最大整数位：" + Math.floor(-23.45));
        System.out.println("23.45四舍五入的结果为：" + Math.round(23.45));
        System.out.println("23.55四舍五入的结果为：" + Math.round(23.55));
        System.out.println("23和45的最大值为: " + Math.max(23, 45));
        System.out.println("12和34的最小值为: " + Math.min(12 , 34));
        System.out.println("2的3次幂计算结果为: " + Math.pow(2,3));
        System.out.println("获取到的0-1之间的随机数为: " + Math.random());
    }

}

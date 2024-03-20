package sias.api;

public class ShuiXian {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            // 个位 十位 百位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            // 判断:
            // 每一位的三次方之和 跟本身 进行比较。
            double sum = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);
            if (sum == i) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("水仙花数：" + count);
    }
}


package sias.api;

public class MathDemo02 {
    public static void main(String[] args) {
        System.out.println(isPrime(997));
    }

    public static boolean isPrime(int num) {
        int count = 0;
        for (int i = 2; i <= num; i++) {
            count++;
            if (num % i == 0) {
                return false;
            }

        }
        System.out.println(count);
            return true;
    }
}

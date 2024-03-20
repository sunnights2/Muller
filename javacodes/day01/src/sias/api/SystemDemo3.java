package sias.api;

public class SystemDemo3 {
    public static void main(String[] args) {
        int[] srcArray = {23, 45, 67, 89, 14, 56};
        System.arraycopy(srcArray, 3, srcArray, 2, 3);
        for (int x = 0; x < srcArray.length; x++) {
            if (x != srcArray.length - 1) {
                System.out.print(srcArray[x] + ", ");
            } else {
                System.out.println(srcArray[x]);
            }
        }
    }
}


package sias.api;

public class SystemDemo2 {
    public static void main(String[] args) {

        int[] srcArray = {23, 45, 67, 89, 14, 56};
        int[] desArray = new int[10];

        System.arraycopy(srcArray, 0, desArray, 1, 3);
        for (int x = 0; x < desArray.length; x++){
            if (x != desArray.length-1){
                System.out.println(desArray[x] + ",");
            }else {
                System.out.println(desArray[x]);
            }
        }
    }
}

package com.day06;

public class GetPosition {public static void main(String[] args) {
    //定义一个方法获取数字，在数组中的索引位置，将结果返回给调用处
    //如果有重复的，只要获取第一个即可
    int[] arr = {1,2,3,4,5};
    int index = contains(arr, 3);
    System.out.println(index);
}
    public static int contains(int[] arr, int number) {
        //遍历arr得到每一个元素
        for (int i = 0; i < arr.length; i++) {
            //拿着每一个元素跟number比较
            if(arr[i] == number){
                //如果相等，表示找到了
                return i;
            }
        }
        //当循环结束之后，如果还不能返回索引，表示数组中不存在该数据
        //可以返回-1
        return -1;
    }

}

package sias.list;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<String> array = new ArrayList<String>();

        // 添加元素
        array.add("吆西");
        array.add("good");
        array.add("java");
        array.add("Spring");
        array.add("mybatis");
        array.add("hibernate");
        array.add("hadoop");
        array.add("hive");

        // public boolean remove(Object o)：删除指定的元素，返回删除是否成功
        System.out.println(array.remove("world"));
        System.out.println(array.remove("javaee"));

        // public E remove(int index)：删除指定索引处的元素，返回被删除的元素
        System.out.println(array.remove(1));

        // IndexOutOfBoundsException
        System.out.println(array.remove(3));

        // public E set(int index,E element)：修改指定索引处的元素，返回被修改的元素
        System.out.println(array.set(1, "javaee"));

        // IndexOutOfBoundsException
//        System.out.println(array.set(20, "javaee"));

        // public E get(int index)：返回指定索引处的元素
        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
//        System.out.println(array.get(20));

        // public int size()：返回集合中的元素的个数
        System.out.println(array.size());

        // 输出集合
        System.out.println("array:" + array);
    }
}



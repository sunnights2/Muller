package sias.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        Collection<String> c = new ArrayList<>();

		c.add("1");
		c.add("2");
		c.add("3");
		c.add("java");
		c.add("5");

		Iterator<String> it = c.iterator();
		while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
//        System.out.println("----------------------");
//
//        for(String str:c){
//            System.out.println(str);
//        }
//
//        System.out.println("----------------------");
//
//        Iterator<String> it2 = c.iterator();
//        while(it2.hasNext()){
//			System.out.println(it.next());
//		}
	}
}

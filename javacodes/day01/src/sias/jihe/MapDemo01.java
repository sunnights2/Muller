package sias.jihe;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("01","张三");
        map.put("郭祭酒","奉孝");
        map.put("05","张飞");

        System.out.println(map.get("01"));
        System.out.println(map.get("02"));

        Set<String> keySet = map.keySet();
        for (String key : keySet){
            System.out.println(key);
        }
        Collection<String> values = map.values();
        for (String value : values){
            System.out.println(value);
        }
    }
}

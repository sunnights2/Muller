package sias.jihe;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map <String,String> map =new HashMap<String, String>();
        // 遍历Map
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");
        map.put("4", "value1");
        // 输出原始Map
        System.out.println("原始Map："+map);
    }
}

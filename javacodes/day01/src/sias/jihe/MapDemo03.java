package sias.jihe;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo03 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("张无忌", "赵墩");
        map.put("郭祭酒", "奉孝");
        map.put("杨过", "咕咕");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        // 遍历键值对对象的集合，得到每一个键值对对象
        for (Map.Entry<String, String> me : entrySet) {
            // 根据键值对对象获取键和值
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key + "," + value);
        }
    }
}



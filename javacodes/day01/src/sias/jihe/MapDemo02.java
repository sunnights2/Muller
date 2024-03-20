package sias.jihe;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("张无忌", "赵墩");
        map.put("郭祭酒", "奉孝");
        map.put("杨过", "咕咕");

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            String value = map.get(key);
            System.out.println(key + "," + value);
        }
    }
}

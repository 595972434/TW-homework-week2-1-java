package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> result = new HashMap<String, Integer>();
        for(int i=0; i<collectionA.size(); i++) {
            if (!result.containsKey(collectionA.get(i))) {
                result.put(collectionA.get(i), 1);
            } else {
                result.put(collectionA.get(i),result.get(collectionA.get(i)) + 1);
            }
        }
        for (String key : result.keySet()) {
            if(object.get("value").contains(key)){
                result.put(key,result.get(key)-result.get(key)/3);
            }
        }
        return result;
    }
}

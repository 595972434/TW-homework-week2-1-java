package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> result = new HashMap<String, Integer>();
        for (String key : collectionA.keySet()) {
            if(object.get("value").contains(key)){
                result.put(key,collectionA.get(key)-collectionA.get(key)/3);
            }
            else{
                result.put(key,collectionA.get(key));
            }
        }

        return result;
    }
}

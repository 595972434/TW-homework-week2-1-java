package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> result = new HashMap<String, Integer>();
        for(int i=0; i<collectionA.size(); i++) {
            if(collectionA.get(i).length()>1) {
                String key=collectionA.get(i).substring(0,1);
                int num= Integer.parseInt(collectionA.get(i).substring(2,3));
                result.put(key, num);
            }
            else{
                if (!result.containsKey(collectionA.get(i))) {
                    result.put(collectionA.get(i), 1);
                } else {
                    result.put(collectionA.get(i), result.get(collectionA.get(i)) + 1);
                }
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

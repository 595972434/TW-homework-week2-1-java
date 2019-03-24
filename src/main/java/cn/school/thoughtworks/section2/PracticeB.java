package cn.school.thoughtworks.section2;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class PracticeB {
    Map<String,Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result = new HashMap<String, Integer>();
        for(int i=0; i<collection1.size(); i++) {
            if(collection1.get(i).length()>1) {
               String key=collection1.get(i).substring(0,1);
               int num= Integer.parseInt(collection1.get(i).substring(2,3));
               result.put(key, num);
            }
            else{
                if (!result.containsKey(collection1.get(i))) {
                    result.put(collection1.get(i), 1);
                } else {
                    result.put(collection1.get(i), (Integer) result.get(collection1.get(i)) + 1);
                }
            }

        }
        return result;
    }
}

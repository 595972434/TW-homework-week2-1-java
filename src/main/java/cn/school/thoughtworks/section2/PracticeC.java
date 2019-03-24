package cn.school.thoughtworks.section2;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result = new HashMap<String, Integer>();
        for(int i=0; i<collection1.size(); i++) {
            if(collection1.get(i).length()>1) {
                String[] str=collection1.get(i).split("\\-|\\:|\\[|\\]");
                String key=str[0];
                int num= Integer.parseInt(str[1]);
                if (!result.containsKey(key)) {
                    result.put(key, num);
                } else {
                    result.put(key,(Integer) result.get(key) + num);
                }
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

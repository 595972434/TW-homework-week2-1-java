package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.ArrayList;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> result=new ArrayList<String>();
        for(int i=0;i<collection1.size();i++)
        {
            if(collection2.get(0).contains(collection1.get(i)))
            {
                result.add(collection1.get(i));
            }
        }
        return result;
    }
}

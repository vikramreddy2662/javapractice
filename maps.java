package CollectionsFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class maps {
    public static void main(String[] args){
        Map<Integer,String> m=new HashMap();
        m.put(123,"vikram");
        m.put(101,"vikas reddy");
        m.put(205,"hemanth");

        Set s=m.entrySet();

        Iterator it=s.iterator();

        while (it.hasNext()){
            Map.Entry e=(Map.Entry)it.next();
            System.out.println(e.getKey()+":"+e.getValue());
        }

        for(m.Entry:)







    }
}

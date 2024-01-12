package CollectionsFramework;

import java.util.Hashtable;
import java.util.Map;

public class hashtable {
    public static void main(String[] args){
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.putAll(Map.of(21,"apples",32,"oranges",54,"kiwi"));
        System.out.println(ht.getOrDefault(22,"NotFound"));//it's like a if else statement.
        System.out.println(ht.putIfAbsent(34,"banana"));
        for(Map.Entry e:ht.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }

    }
}

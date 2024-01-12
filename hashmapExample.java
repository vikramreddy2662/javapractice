package CollectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class hashmapExample {
    public static void main(String [] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.putAll(Map.of(1,"hyderabad",3,"karimnagar",7,"noida",9,"nizambad"));
        System.out.println(hm);
        hm.put(3,"warangal");//if we insert new <k,v>pair it replaces existing  value at that key.
        System.out.println(hm.entrySet());
        for(Map.Entry m: hm.entrySet()){
            System.out.println(m);
        }
        hm.putIfAbsent(7,"kakinada");//inserts only if its not present in the view of map
        hm.putIfAbsent(12,"banglore");
        System.out.println(hm);
        hm.replace(12,"chennai");//replaces specified value for a key
        System.out.println(hm);
        hm.replace(12,"chennai","banglore");//replaces with new value for a old value to a specified key element
        System.out.println(hm);
        System.out.println(hm.containsKey(7));
        System.out.println(hm.containsValue("chennai"));
        hm.remove(12);
        System.out.println(hm);
        hm.put(13,"hyderabad");//map accepts duplicate values but won't accept duplicate keys.
        System.out.println(hm);
       // hm.replaceAll((k,v)->"hyderabad");
       // System.out.println(hm);//replaces all values of all keys with specified value.
       // hm.clear();
        hm.put(0,"rangareddi");//map accepts only one null key but it accepts multiple null values.
        hm.put(32,null);
        hm.put(23,null);
        System.out.println(hm);



    }
}

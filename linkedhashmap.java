package CollectionsFramework;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedhashmap {
    public static void main(String[] args){
       LinkedHashMap <Integer,String> lhm=new LinkedHashMap<>();
       lhm.putAll(Map.of(21,"vikram",34,"vikas",54,"hemanth"));
       System.out.println("keys in the map:"+lhm.keySet());
       System.out.println("values in the map are:"+lhm.values());
       System.out.println("Entries in the map are:"+lhm.entrySet());
       lhm.put(43,"revanth");
       lhm.replace(21,"gowtham");
       System.out.println(lhm);
      // lhm.replaceAll((k,v)->"ajay");
       for(Map.Entry m:lhm.entrySet()) {
           System.out.println(m.getKey()+":"+m.getValue());
       }
       lhm.remove(21);
        System.out.println(lhm.get(32));



    }
}

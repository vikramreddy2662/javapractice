package CollectionsFramework;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class mapsexample1 {
    public static void main(String[] args){
        Map<Integer,String> map=new HashMap<>();

        map.putAll(Map.of(1,"vikram",2,"harish",4,"akhil",7,"amul"));

        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+":"+m.getValue());
        }

             map.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                     .forEach(m->System.out.println(m));

        System.out.println(map.hashCode());//returns hashcode values of a map.

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(m->System.out.println(m));

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(m->System.out.println(m));


    }
}

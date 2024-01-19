package JavaPractice;

import java.util.*;
import java.util.stream.Collectors;

public class streamApi {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        TreeSet<Integer> s=new TreeSet<>();
        s.addAll(List.of(12,32,12,13,7,25));
        System.out.println(s);

        a.addAll(List.of(12,32,34,2,15,45,32,43,25));
       Set<Integer> ss= a.stream()
                .distinct()
                .sorted()
               .collect(Collectors.toSet());
                //.forEach(e->System.out.println(e));
        System.out.println(ss);

        ArrayList<String> aa=new ArrayList<>();
        aa.addAll(List.of("vikram","vikas","hemanth","anil"));

        //Map<Integer,String> l=aa.stream()
        Set<String> set=aa.stream()
                .map(e->e.toUpperCase())
                //.collect(Collectors.toList());
                .collect(Collectors.toSet());
                        //.collect(Collectors.toMap(String::length,e->e));
                System.out.println(set);

    }
}
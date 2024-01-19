package JavaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class streamsmethods {
    public static void main(String[] args){
        ArrayList<Integer> a=new ArrayList<>();
        a.addAll(List.of(12,32,14,5,24,12,14));

        int sum = a.stream()
              .reduce(0,(n1,n2)->n1+n2);
      System.out.println(sum);

     int max= a.stream()
              .max((n1,n2)->Integer.compare(n1,n2)).get();
     System.out.println(max);

     int min=a.stream()
             .min((n1,n2)->Integer.compare(n1,n2)).get();
     System.out.println(min);

     List<Integer> l=a.stream()
             .map(n->n*2)
             .collect(Collectors.toList());
//             .forEach(n->System.out.println(n));
        System.out.println(l);

        Set<Integer> s=a.stream()
                .collect(Collectors.toSet());
        System.out.println(s);

        List<String> l1=new ArrayList<>();
        l1.addAll(List.of("apples","oranges","mango","kiwi"));

       Map<Integer,String> map = l1.stream()
                .collect(Collectors.toMap(String::length,S->S));//java is case insensitive s!=S
                System.out.println(map);



    }
}

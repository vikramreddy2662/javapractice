package CollectionsFramework;

import java.util.*;

public class Collections_Sort {
    public static void main(String[] args){
    ArrayList<String> al=new ArrayList<>();
    al.addAll(List.of("Giraffe","Zebra","Animal","Sultan","Bufallo"));
    System.out.println(al);
//        ListIterator<String> lit=al.listIterator();
//        while (lit.hasPrevious()){
//
//            System.out.println(lit.previous());
//        }
//        Iterator<String> it=al.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//        al.forEach(e->System.out.println(e));
//
//        for(String word:al){
//            System.out.println(word);
//        }
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);
        al.addAll(List.of("India","Canada","zimbambwe","America","California","SouthAfrica"));
        Collections.sort(al);
        System.out.println(al);
        System.out.println(al.indexOf("America"));
        System.out.println(al.size());
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }





}}

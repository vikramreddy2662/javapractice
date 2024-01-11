package CollectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class arraylistoperatons {
    public static void main(String[] args){
        ArrayList<String> al=new ArrayList<>();
        al.addAll(List.of("Telangana","andhrapradesh","assam","sikkim"));
        al.add(1,"Goa");
        //System.out.println(al);

        ArrayList<String> al1=new ArrayList<>();
        al1.addAll(List.of("Hyderabad","amaravathi","dispur","gangtok"));

        al.addAll(0,al1);
        al.remove(0);
       // al.clear(); clears all the elements in the array
        al.retainAll(al1);//retains common elements in both the array
        System.out.println(al);

        ArrayList<Integer> a=new ArrayList<>();
        a.addAll(List.of(12,34,56));
        a.add(1,90);//using the add method we can add the element at specific position.
        a.add(45);//by default it will be added at the end.
        a.add(3,17);
        a.set(2,89);//using the set method we can replace an element at any position.
        a.remove(3);
        //a.clear(); clears entire list.
        System.out.println(a);
       System.out.println(a.get(3));

    }
}

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
    }
}

package CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import  java.util.List;
import java.util.ListIterator;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.addAll(List.of("apple","orange","banana","jelly"));

        List<String> li=new ArrayList<String>();
        li.addAll(List.of("telangana","assam","bihar","andhrapradesh"));
        al.addAll(li);

        System.out.println(al.contains("assam"));
        al.set(7,"karnataka");
        al.get(5);
        al.remove(3);

        Iterator<String> it=al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Traversing over list of elements using Iterator interface");

        ListIterator<String> lit=al.listIterator();
        while (lit.hasPrevious()){
            System.out.println(lit.previous());
        }
        System.out.println("Traversing over list of elements ListIterator interface");

        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
        System.out.println("Traversing over list of elements using for loop");

        al.forEach(e->{
            System.out.println(e);
        });
        System.out.println("Traversing over list of elements using for each loop");
    }
}

package CollectionsFramework;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class linkedlist2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("vikram");
        ll.addAll(List.of("vikas", "hemanth", "revanth", "vikram"));
        //ll.removeFirstOccurrence("vikram");//removes first occurence of an element
        ll.removeLastOccurrence("vikram");//removes last occurence of an element
        System.out.println(ll);


        LinkedList<String> ll2 = new LinkedList<>(List.of("abhi","sanvith","vikram","vikas"));
        ll.addAll(ll2);
        HashSet<String> h=new HashSet<>(ll);//we can easily remove duplicate elements.
        System.out.println(h);
    }
}
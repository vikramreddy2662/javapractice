package CollectionsFramework;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class linkedlist {
    public static void main(String[]  args){
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addAll(List.of(12,3,4,56,67));

        //  Iterator<Integer> it=ll.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }


        ll.stream()
                .filter(n->n%2==1)
                .map(n->n+2)
                .forEach(n->System.out.println(n));






    }
}

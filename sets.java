package CollectionsFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class sets {
public static void main(String[] args){
    HashSet<Integer> h=new HashSet<>();
    h.addAll(List.of(12,3,43,21,3,12,56));

    Iterator<Integer> it= h.iterator();

    while (it.hasNext()){

        System.out.println(it.next());
    }
    System.out.println(h.size());

    System.out.println(h.remove(3));
    System.out.println(h);

}
}

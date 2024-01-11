package CollectionsFramework;

import com.sun.source.util.Trees;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class treesets {
    public static void main(String[] args){
        TreeSet<Integer> t=new TreeSet<>();
        t.addAll(Set.of(2,34,23,12,56));//ignores duplicates and stores them in sorted order
        System.out.println(t);
        System.out.println("PollFirst:"+t.pollFirst());//returns leastmost number
        System.out.println("pollLast:"+t.pollLast());//returns greatermost number
        System.out.println("headSet:"+t.headSet(34,false));//returns elements from begining to that number
        System.out.println("TailSet:"+t.tailSet(34,false));//returns elements from that number to end
        System.out.println("Subset:"+t.subSet(23,true,56 ,true));//returns number within the specified range
    }
}

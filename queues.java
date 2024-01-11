package CollectionsFramework;

import java.util.List;
import java.util.PriorityQueue;

public class queues {
    public static void main(String[] args){
        PriorityQueue<Integer> p=new PriorityQueue<>();
       p.addAll(List.of(12,21,3,45,32,6));
       System.out.println(p);
       //System.out.println(p.poll());
       System.out.println(p.peek());
       System.out.println(p.offer(78));
       System.out.println(p.element());
       System.out.println(p.poll());
       System.out.println(p);

    }
}

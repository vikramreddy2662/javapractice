package CollectionsFramework;

import java.util.*;

public class queue {
    public static void main(String[] args){
        Queue<Integer> q3=new PriorityQueue<>();
        //priority queues doesn't allow null values.

//        q.add(12);
//        q.add(34);
//        q.add(56);
//        q.add(78);
        Queue<Integer> q=new LinkedList<>();
        q.addAll(List.of(12,45,67,89,54));
        System.out.println(q);

        Queue<Integer> q1=new ArrayDeque<>();
        q1.addAll(List.of(435,67,313,89));
        System.out.println(q1);






    }
}

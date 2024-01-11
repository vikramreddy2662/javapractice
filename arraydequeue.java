package CollectionsFramework;

import java.util.ArrayDeque;
import java.util.List;
//arraydequeue implements dequeue interface Double ended queue we can perform insertion and deletion at both the ends
public class arraydequeue {
    public static void main(String[] args){
        ArrayDeque<Integer> a=new ArrayDeque<>();
        a.addAll(List.of(12,21,3,45,6,2));
        System.out.println(a);
        System.out.println(a.offer(56));//inserts an element into the queue by default inserts at the end
        System.out.println(a.pollFirst());//retrieves and removes head element from first
        System.out.println(a.pollLast());//retrieves and removes head element at the end
        System.out.println(a.peek());//only retrieves element from the queue won't remove
        System.out.println(a.peekFirst());//retrieves first element from the queue
        System.out.println(a.peekLast());///retrieves last element from the queue
        System.out.println(a.offerFirst(78));//inserts element at the front
        System.out.println(a.offerLast(90));//inserts element at the end
        System.out.println(a);
        System.out.println(a.removeFirst());//removes element from the front
        System.out.println(a.removeLast());//removes element from  the end
        System.out.println(a);


    }
}

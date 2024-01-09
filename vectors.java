package CollectionsFramework;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class vectors {
    public static void main(String[] args){
        Vector<Character> v=new Vector<>();

        v.addAll(List.of('A','R','G','W','O','F'));

        Iterator<Character> it=v.iterator();
        v.set(5,'T');
        v.contains('F');
        v.remove(1);

        while (it.hasNext()){
            System.out.println(it.next());
        }
//        for(Character c:v){
//            System.out.println(c);
//        }
        System.out.println(v.size());





    }
}

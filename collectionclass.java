package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionclass {
    public static void main(String[] args){
        ArrayList<Integer> l=new ArrayList<>(List.of(12,21,1,3,23,7,18));
        System.out.println(Collections.min(l));
        System.out.println(Collections.max(l));
        Collections.sort(l);
        System.out.println(l);
        Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);
    }
}

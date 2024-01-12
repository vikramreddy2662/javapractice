package CollectionsFramework;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

enum days{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}
public class enumsets {
    public static void main(String[] args){
        Set<days> set=EnumSet.of(days.FRIDAY,days.SATURDAY);

        Iterator<days> it=set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        Set<days> set1=EnumSet.allOf(days.class);
        Set<days> set2=EnumSet.noneOf(days.class);

        System.out.println(set1);
        System.out.println(set2);

    }
}

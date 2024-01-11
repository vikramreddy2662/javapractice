package CollectionsFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

class College{
    String name;
    String branch;
    int blockno;

    double fee;

    College(String name,String branch,int blockno,double fee){
        this.name=name;
        this.branch=branch;
        this.blockno=blockno;
        this.fee=fee;

    }
}

public class linkedhashset {
    public static void main(String[] args){
        College c1=new College("geethnjali","CSE",1,230000);
        College c2=new College("vasavi","MECH",2,45000);
        College c3=new College("srinidhi","CIVIL",1,56000);

        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.addAll(List.of("Karimnagar","Warangal","Vijayawada","Hyderabad","Nellore"));
        System.out.println(lhs);

        LinkedHashSet<College> l=new LinkedHashSet<>(List.of(c1,c2,c3));

//        Iterator<College> it=l.iterator();
//        while (it.hasNext()){
//            College c=it.next();
//            System.out.println(c.name+":"+c.branch+":"+c.blockno+":"+c.fee);
//        }
        for(College c:l){
            System.out.println(c.name+":"+c.branch+":"+c.blockno+":"+c.fee);
        }



    }
}

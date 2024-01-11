package CollectionsFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

class Registration{
    String name;
    int age;

    String college;

    public Registration(String name,int age,String college){
        this.name=name;
        this.age=age;
        this.college=college;
    }
}
public class hashsetobjects {
    public static void main(String[] args){
        Registration r1=new Registration("vikram",24,"Geethanjali");
        Registration r2=new Registration("vikas",23,"vasavi");
        Registration r3=new Registration("hemanth",22,"Kits");

        HashSet<Registration> h=new HashSet<>();
        h.addAll(List.of(r1,r2,r3));

        Iterator<Registration> it=h.iterator();
        h.remove(2);
        while(it.hasNext()){

            Registration r=it.next();
            System.out.println(r.name+":"+r.age+":"+r.college);

        }

    }
}

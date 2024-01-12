package CollectionsFramework;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

class  Student55{
    String name;
    int age;
    double marks;

    Student55(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.marks=marks;

    }
}
public class hashtableobjects {
    public static void main(String[] args){

        Student55 s1=new Student55("vikram",21,700);
        Student55 s2=new Student55("hemanth",23,300);
        Student55 s3=new Student55("vikas reddy",24,800);

        Hashtable<Integer,Student55> h=new Hashtable<>(Map.of(1,s1,4,s2,6,s3));
        TreeMap<Integer,Student55> t=new TreeMap<>(h);

        for(Map.Entry<Integer,Student55> m: t.entrySet()){
            int key=m.getKey();
            System.out.println("Student details at key:"+key);
            Student55 s=m.getValue();
            System.out.println(s.name+":"+s.age+":"+s.marks);
        }



    }
}

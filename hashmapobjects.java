package CollectionsFramework;

import java.util.HashMap;
import java.util.Map;

class Student100{
    String name;
    int age;
    double marks;

    Student100(String name,int age,double marks){
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
}
public class hashmapobjects {
    public static void main(String[] args){
        Student100 s1=new Student100("vikram",21,300);
        Student100 s2=new Student100("vikas reddy",23,500);
        Student100 s3=new Student100("vikram",22,400);

        HashMap<Integer,Student100> m=new HashMap<>();
        m.putAll(Map.of(1,s1,2,s2,3,s3));

        for(Map.Entry<Integer,Student100> e: m.entrySet()){
            int  key=e.getKey();
            System.out.println(key +":details");
            Student100 s=e.getValue();
            System.out.println(s.name+":"+s.age+":"+s.marks);
        }
    }
}

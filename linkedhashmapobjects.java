package CollectionsFramework;

import java.util.LinkedHashMap;
import java.util.Map;

class Employee11{
    String name;
    int age;
    double salary;

    Employee11(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
}
public class linkedhashmapobjects {
    public static void main(String[] args){
        Employee11 e1=new Employee11("vikram",24,30000);
        Employee11 e2=new Employee11("vikas",23,45000);
        Employee11 e3=new Employee11("hemanth",43,5000);

        LinkedHashMap<Integer,Employee11> l=new LinkedHashMap<>();
        l.putAll(Map.of(1,e1,3,e2,2,e3));

        for(Map.Entry<Integer,Employee11> e:l.entrySet()){
            int key=e.getKey();
            Employee11 a=e.getValue();
             System.out.println("Student details:"+key);
            System.out.println(a.name+":"+a.age+":"+a.salary);


        }


    }
}

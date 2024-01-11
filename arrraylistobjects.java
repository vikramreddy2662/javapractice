package CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

class Employee{
    String name;
    int age;
    double salary;
    Employee(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
}
public class arrraylistobjects {
    public static void main(String[] args){
        Employee e1=new Employee("vikram",21,20000);
        Employee e2=new Employee("vikas",22,40000);
        Employee e3=new Employee("hemanth",23,25000);

        ArrayList<Employee> al=new ArrayList<>(List.of(e1,e2,e3));

        Iterator<Employee> it=al.iterator();

        while(it.hasNext()){

            Employee e=it.next();
            System.out.println(e.name + ":"+e.age+":"+e.salary);
        }

    }
}

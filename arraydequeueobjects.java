package CollectionsFramework;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;

class Employee56{
String name;
int age;
double salary;

Employee56(String name,int age,double salary){
    this.name=name;
    this.age=age;
    this.salary=salary;
}
}
public class arraydequeueobjects {
    public static void main(String[] args){
        Employee56 e1=new Employee56("vikram",21,40000);
        Employee56 e2=new Employee56("vikas",24,30000);
        Employee56 e3=new Employee56("vikram",20,50000);

        ArrayDeque<Employee56> a=new ArrayDeque<>();
        a.addAll(List.of(e1,e2,e3));

        Iterator<Employee56> it=a.iterator();
        while (it.hasNext()){
            Employee56 e=it.next();
            System.out.println(e.name+":"+e.age+":"+e.salary);
        }


    }
}

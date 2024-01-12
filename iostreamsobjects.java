package CollectionsFramework;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

class Employee66{
String name;
int age;
double salary;

Employee66(String name,int age,double salary){
    this.name=name;
    this.age=age;
    this.salary=salary;
}
}
public class iostreamsobjects {
  public static void main(String[] args){
      Employee66 e1=new Employee66("vikram",21,40000);
      Employee66 e2=new Employee66("vikas",22,30000);
      Employee66 e3=new Employee66("hemanth",32,40000);

      TreeMap<Integer,Employee66> t=new TreeMap<>(Map.of(1,e1,5,e2,3,e3));
      try {
          FileOutputStream f=new FileOutputStream("D:\\File.txt");
          ObjectOutputStream o=new ObjectOutputStream(f);

          for(Map.Entry<Integer,Employee66> entry:t.entrySet()){
              int k=entry.getKey();
              Employee66 e=entry.getValue();
              o.write(k);
              o.writeObject(e);
          }

      }
      catch (Exception e){}
      try{
          FileInputStream f1=new FileInputStream("D:\\File.txt");
          ObjectInputStream  oi=new ObjectInputStream(f1);
          int i=0;
          while (i!=-1){
              System.out.println("the details at key:"+i);
              i=oi.read();
          }
          Employee66 e=(Employee66) oi.readObject();
          System.out.println(e.name+":"+e.age+":"+e.salary);

      }
      catch (Exception e){}

  }
}

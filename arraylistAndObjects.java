package CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
    String name;
    int age;
    double marks;

    Student(String name,int age,double marks){
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
}

public class arraylistAndObjects {
    public static void main(String[] args){
        Student s1=new Student("vikram",21,200);
        Student s2=new Student("vikas",22,500);
        Student s3=new Student("hemanth",23,600);
        ArrayList<Student> al=new ArrayList<Student>();
        al.addAll(List.of(s1,s2,s3));

        Iterator<Student> it=al.iterator();

        while (it.hasNext()){
            Student s=it.next();
            System.out.println(s.name+":"+s.age+":" +s.marks);
        }

    }
}

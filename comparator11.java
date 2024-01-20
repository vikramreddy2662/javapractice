package JavaPractice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class worker implements Comparable<worker> {
    String name;
    int age;
    double salary;

    worker(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;}

    @Override
    public int compareTo(worker w) {
        if(age<w.age){
            return  1;
        }
        else
            return  -1;

    }
}
public class comparator11 {
    public static void main(String[] args){
worker w1=new worker("vikram",24,20000);
worker w2=new worker("tulsi",22,23000);
worker w3=new worker("vikas",22,25000);

TreeSet<worker> t=new TreeSet<>(Set.of(w1,w2,w3));

        Iterator<worker> it=t.iterator();
        while (it.hasNext()){
        worker w=(worker) it.next();
        System.out.println(w.name+":"+w.age+":"+w.salary);
        }
    }}

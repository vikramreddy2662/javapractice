package JavaPractice;
class Student67{
    String name;
    int age;
    double marks;

    Student67(String name,int age){
        this.name=name;
        this.age=age;
    }
    Student67(String name,int age,double marks){
        this(name,age);
        this.marks=marks;
    }
    void display(){
        System.out.println(name+":"+age+":"+marks);
    }
}
public class thisInvokeContructor {
    public static  void  main(String[] args){
Student67 s=new Student67("vikram reddy",23);
Student67 s1=new Student67("vikram reddy",23,564);

s.display();
s1.display();

    }
}

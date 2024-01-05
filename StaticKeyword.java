package JavaPractice;
 class Student23{
    String name;
    int age;
    static String college="geethanjali";

    static void change(){
        double salary=20000;
        System.out.println(salary);
    }
    Student23(String n,int i){
        name=n;
        age=age;
    }
void display(){
    System.out.println(name+":"+age+":"+college);

}}

public class StaticKeyword {
    public static void  main(String[] args){
        Student23.change();
        Student23 s1= new Student23("vikram", 12);
        Student23 s2= new Student23("vikas", 22);
        Student23 s3= new Student23("hemanth", 32);

        Student23.college="vasavi";
        s1.display();
        s2.display();
        s3.display();





    }
}

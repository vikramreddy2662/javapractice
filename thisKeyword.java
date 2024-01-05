package JavaPractice;
class Student{
    String name;
    int age;
    double marks;
    String college;
    Student(String name,int age,double marks){
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
    public void Odd(int j,int n){
        for(int i=j;i<=n;i++) {
            if(i%2==1){
                System.out.println(i);
            }
        }

    }
    public  int Even(int k,int l){
        this.Odd(4,20);
        for(int m=k;m<=l;m++) {
            if(m%2==0) {
            }
        return m ;}

        return 0;
    }

    Student(String name,int age,double marks,String college){
        this(name,age,marks);
        this.college=college;
    }
    void display(){
        System.out.println(name+":"+age+":"+marks+":"+college);
    }
}
public class thisKeyword {
    public static  void main(String[] args){
        Student s=new Student("vikram reddy",12,566,"Geethanjali");
        s.display();
       System.out.println( s.Even(3,12));
    }
}

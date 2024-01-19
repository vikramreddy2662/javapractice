package lambdaexpressions;
interface Stud1
{
    //public void  addable(int a,int b);
    //public void StudentDetails(String name,int age,double salary);
    public String details(String name);
}
public class expression1 {
    public static void main(String[] args){

//        Stud1 s=(a,b)->{
//            System.out.println("Sum of the numbers is :"+(a+b));
//        };
//        s.addable(23,45);

//        Stud1 s=(name,age,salary)->{
//            System.out.println(name+":"+age+":"+salary);
//
//        };
//        s.StudentDetails("vikram",23,45000);

        Stud1 s=(name)->{
          return "name:"+name;
        };
        System.out.println(s.details("vikram Reddy"));

    }
}

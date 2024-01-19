package lambdaexpressions;
interface Stud{
    public void drive();

}
public class expression {
    public static void main(String[] args){
     Stud s=()->{
         System.out.println("driving tata harrier is too crazy");
     };
     s.drive();
    }
}

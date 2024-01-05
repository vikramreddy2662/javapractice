package JavaPractice;

class A{
    private  void msg(){
        System.out.println("This message is printed");
    }
}
public class accessModifier {
    public static void main(String[] args){
        A obj=new A();
        obj.msg();
    }


}

package JavaPractice;
//AnonymousObjects:objects without a name;
class Factorial{
    public int fact(int fact,int n){
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return  fact;
    }
}
public class AnonymousObjects {
    public static  void main(String[] args) {
        System.out.println(new Factorial().fact(1, 5));
    }
}

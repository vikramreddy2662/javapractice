package JavaPractice;
public class MethodOverloading {
    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double a,double b){
        return  a+b;
    }
 public  static  void main(String[] args){
      System.out.println( add(22,45));
      System.out.println(add(34.6,875848.9));
    }
}

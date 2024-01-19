package JavaPractice;

import java.util.function.BiFunction;

class Arithmetic{
    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double d1,double d2){
        return d1+d2;
    }
}
public class methodreference1 {
    public static void main(String[] args){
        BiFunction<Integer,Integer,Integer> b=Arithmetic::add;
        BiFunction<Double,Double,Double> d=Arithmetic::add;

        int result1=b.apply(21,32 );
         double result2=d.apply(23.4,43.6);

         System.out.println(result2);
         System.out.println(result1);




    }

}

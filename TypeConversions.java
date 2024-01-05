package JavaPractice;
//wrapper classes are also used for type conversions in java
//we can covert  data of one data type to another
public class TypeConversions {
public static void main(String[] args) {
    int i = 123;

    String s = String.valueOf(i);//integer to string
    System.out.println(s);

    double d=Double.parseDouble(s);//string to double
    System.out.println(d);

    int j=(int)d;
    System.out.println(j);//converting double to int

    Integer a=j;
    System.out.println(a);//autoboxing

    int b=a;
    System.out.println(b);//auto unboxing

    //we can also convert values from one data type to another data type using valueOf method.
    Integer c=Integer.valueOf(b);//wrapping into an object c of Integer class.
    System.out.println(c);

    String s3=String.valueOf(c);
    System.out.println(s3+3241324);

    String s5=s3;//auto unboxing
    System.out.println(s5);






}


}

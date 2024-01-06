package JavaPractice;
//throws keyword is used to declare exceptions that may or may not occur .
//it's mainly used to declare checked exceptions  but we can declare checked and unchecked exceptions

import java.io.IOException;

class M{
    public static void N(int c) throws ArithmeticException{
        int a=90/c;
        throw new ArithmeticException("division is not possible");

    }

}
public class throwsKeyWord {
    public static void main(String[] args) {
//        try {
//            M obj = new M();
//            obj.N(0);
//            System.out.println("rest of the code");
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        M obj = new M();
        obj.N(0);
    }
}

package JavaPractice;
//throw keyword is used to throw userdefined exceptions custom exceptions
//throw keyword can also throw checked and checked and unchecked exceptions.
public class throwKeyword {
    public static void AgeValidate(int age){
        if(age<18){
            throw new ArithmeticException("Person is not eligible for vote");
        }
        else{
            System.out.println("He is eligible for vote");
        }}
    public static void main(String[] args){
         AgeValidate(13);
         System.out.println("rest of the code");



    }
}

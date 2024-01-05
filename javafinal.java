package JavaPractice;
//final class Car{ cannot inherit a final class in child class
class Car{
    final String name="volvo";
    int modeno=4;

    final void run(){
        System.out.println("car runs at high speed");
    }
}
class supercar extends Car{
//    void run(){
//        System.out.println("car runs at 150kmph");
//    }
}
public class javafinal {
    public  static  void main(String[] args){
        Car c=new Car();
        //c.name="bugati"; cannot change a value
    }
}

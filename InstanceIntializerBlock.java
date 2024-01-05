package JavaPractice;
/*instance intializer blocks are executed everytime when the objects are created these are used
 to intialize instance data members with some values */
class Bike{
    int speed;
    Bike(){
        System.out.println("Super Class Constructor is called with " +speed+ "speed");
    }
    {speed=122;}//instance intializer block
    {System.out.println(" Second Instance intializer block");}
}
public class InstanceIntializerBlock {
public static  void main(String[] args){
    Bike obj=new Bike();
    Bike obj1=new Bike();
}}
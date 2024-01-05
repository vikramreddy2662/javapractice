package JavaPractice;
class Bank{
    void run(){
        System.out.println("rate of interest is low in bank");
    }
}
class canaraBank extends  Bank{
    void run(){
        System.out.println("rate of interest varies from bank to bank");
    }

}
public class MethodOveriding {
    public  static  void main(String[] args){
        Bank b=new canaraBank();//upcasting:creating object for the childclass using reference of obj of super class
        b.run();
    }
}

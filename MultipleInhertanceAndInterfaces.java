package JavaPractice;
interface  Bank21{
    public void  write();
    public void  read();
}
interface Constultancy{
    public  void write();
}
 class office implements  Bank21,Constultancy{
 public  void write(){
     System.out.println("writing filing in bank");
 }
 public void read(){
     System.out.println("reading tax filing in bank");
 }
}

public class MultipleInhertanceAndInterfaces {
    public static  void main(String[] args){
        office o = new office();
        o.read();
        o.write();

    }
}

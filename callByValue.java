package JavaProblems;
class CallBy{
    int data=90;

    public int  Change( CallBy c){
        return c.data+100;//changes will  be in the instance variable.
    }
}
public class callByValue {
    public static  void main(String[] args){
        CallBy c=new CallBy();
System.out.println(c.Change(c));
    }
}

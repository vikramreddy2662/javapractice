package CollectionsFramework;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class stack {
    public static void main(String[] args){
        Stack<String> s=new Stack<>();
       // s.push("fds") ,s.add("");
        System.out.println(s.isEmpty());
        s.addAll(List.of("vikram","vikas","akash","manoj"));
        System.out.println(s);




    }
}

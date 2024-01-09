package JavaProblems;
import java.util.*;

public class collections{
    public static void main(String[] args)
    {
        ArrayList<String> al=new ArrayList<>();
//
//        al.add("ramesh");
//        al.add("raju");
//        al.add("vivek");
//        al.add("harish");
        List<String> al2=new ArrayList<>();

        al2.addAll(List.of("vikram","raju","vivek","harish"));

       al.addAll(al2);

       al.set(3,"hello");

       //al.clear();
        System.out.println(al.contains("raju"));

        Iterator<String> it=al.iterator() ;
        while (it.hasNext()){
            System.out.println(it.next());
        }

//        for(String word:al){
//            System.out.println(word);
//        }




    }
}

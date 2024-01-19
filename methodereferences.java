package JavaPractice;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
public class methodereferences {
    public static void main(String[] args){
        ArrayList<String> a=new ArrayList<>();
        a.addAll(List.of("vikram","vikas","ajay"));
        System.out.println(a);
        a.forEach(e->System.out.println(e));
        a.forEach(System.out::println);
        a.forEach(String::length);






    }
}
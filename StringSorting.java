package JavaProblems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StringSorting {
    public static void main(String[]  args){
        ArrayList<String> al=new ArrayList<>();
        al.addAll(List.of("volkswagen","ferari","audi","bmw","indica"));//sorts elements in alphabhetical order
        System.out.println("Elements in the list before sorting");
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);


    }
}

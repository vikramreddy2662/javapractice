package JavaProblems;

import java.util.*;

public class Sorting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array\n");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements\n");
        ArrayList<Integer> arraylist=new ArrayList<>();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();

            arraylist.addAll(List.of(a[i]));
        }
        Collections.sort(arraylist);
        System.out.println(arraylist);
        Collections.sort(arraylist,Collections.reverseOrder());
        System.out.println(arraylist);









    }
}

package JavaProblems;

public class SwapTwoNumbersWithout3rdVar {
    public static void main(String[] args){
        int a=12;int  b=32;
        System.out.println("numebrs before sorting are:"+a+ ","+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("numbers after sorting are:"+a+ ","+b);


    }
}

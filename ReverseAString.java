package JavaProblems;

public class ReverseAString {

    public static String Reverse(String s){
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args){

       System.out.println(Reverse("hello vikram reddy!"));
    }

}

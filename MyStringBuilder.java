package JavaPractice;

//StringBuilder is also same as stringbuffer used to creare mutable strings.
//it can be accessed by multpile threads at a time.
//provides some additional methods like charAt and substring.
public class MyStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("rakesh reddy");
        System.out.println(sb);
        sb.insert(0, "hello ");
        System.out.println(sb);
        sb.replace(6,12,"vikram");
        System.out.println(sb);
        sb.delete(0,6);
        System.out.println(sb);
        sb.substring(1,6);
        System.out.println(sb);
        System.out.println(sb.charAt(3));




    }
}

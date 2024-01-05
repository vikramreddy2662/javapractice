package JavaPractice;

//String buffer is a class which is used to create mutable String objects.
//it can be accessed by only single thread at a time.
public class MyStringBuffer {
    public static void main(String[] args){
    StringBuffer sb=new StringBuffer();
    System.out.println(sb.capacity());//default capacity is always 16 after string are inserted into the buffer
        //it's size gets increased by (oldcapacity*2)+2
    sb.append("vikram reddy");
    System.out.println(sb);
    sb.insert(0,"vikas ");
        System.out.println(sb);
    sb.replace(2,5,"vikas");
        System.out.println(sb);
        sb.delete(1,4);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());//34
        System.out.println(sb.length());







}}

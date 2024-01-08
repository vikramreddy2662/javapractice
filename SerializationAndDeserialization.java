package Filesinputandoutputstreams;



import java.io.*;

class  Student55 implements Serializable {
    String name;
    int age;
    Double marks;

    Student55(String name,int age,Double marks){
        this.name=name;
        this.age=age;
        this.marks=marks;
    }

}

public class SerializationAndDeserialization {
    public static void main(String[] args){
        /*Serialization is a process of converting object into byte stream  using writeObject()*/
        try {
            Student55 s=new Student55("vikram",23,500.0);
            FileOutputStream f = new FileOutputStream("D:\\File.txt");
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(s);
            o.flush();
            o.close();

        }
        catch (Exception e){

        }
        try
        /*Deserialization is a process of converting byte stream into Object Stream using read Object*/
            {
                FileInputStream f=new FileInputStream("D:\\File.txt");
                ObjectInputStream i=new ObjectInputStream(f);

                Student55 s1=(Student55) i.readObject();

                System.out.println(s1.name+ ":"+s1.age+ ":" +s1.marks);
                i.close();

            }
        catch (Exception e){
                
        }
    }
}
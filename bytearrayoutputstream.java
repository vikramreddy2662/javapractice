package Filesinputandoutputstreams;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

/*byte arrayoutputstreams are used to store the data in its byte array and can be available for
 multiple output streams.
 the data written in byte arrayoutput stream can be available to write for multiple output streams */
public class bytearrayoutputstream {
    public static void main(String[] args){
        try{
        FileOutputStream f1=new FileOutputStream("D:\\File.txt");
        FileOutputStream f2=new FileOutputStream("D:\\File1.txt");

        ByteArrayOutputStream b=new ByteArrayOutputStream();
        b.write(97);
        b.writeTo(f1);
        b.writeTo(f2);

        b.flush();
        b.close();
        System.out.println(b);
        }

        catch(Exception e){
        System.out.println(e);
    }
}}

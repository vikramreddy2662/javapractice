package Filesinputandoutputstreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class FileInputStreamAndIO {
    public static void main(String[] args){
        try{
        FileInputStream f=new FileInputStream("D:\\File.txt");
        BufferedInputStream b=new BufferedInputStream(f);
        //reads data from the input stream and saves data for later use
            int i=b.read();
        // byte s[]=b.readAllBytes();
         //System.out.println(s);
         while(i!=-1){
             System.out.print((char) i);//to see text we need to convert it into character
             i=b.read();
         }
         b.close();
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}

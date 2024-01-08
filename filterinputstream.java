package Filesinputandoutputstreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.FileInputStream;

/*filter input stream implements input stream and it has two subclasses bufferedinputstream and datainputstream
to provide additional functionality */
public class filterinputstream {
    public static void main(String[] args){
    try

    {
        FileInputStream f = new FileInputStream("D:\\File1.txt");
        //FilterInputStream fi = new FilterInputStream(f);
        BufferedInputStream b=new BufferedInputStream(f);

       // int length = f.available();

        int i=0;
        while(i!=-1){
            System.out.print    ((char) i);
            i=b.read();
        }
        b.close();


    }
    catch(Exception e){
        System.out.println(e);
    }

}}

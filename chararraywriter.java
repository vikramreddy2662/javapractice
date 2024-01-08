package Filesinputandoutputstreams;

import java.io.CharArrayWriter;
import java.io.FileWriter;

//the data written in the char array  can be available for multiple files
//the data in the char array can be written to multiple files.
//the size of the char array grows as the data written in the char array increases.
public class chararraywriter {
    public static void main(String[] args){
        try {
            FileWriter f1 = new FileWriter("D:\\File1.txt");
            FileWriter f2 = new FileWriter("D:\\File.txt");
            FileWriter f3 = new FileWriter("D:\\File2.txt");

            CharArrayWriter cw = new CharArrayWriter();

            cw.write("here iam writing data into multiple files using char array writer ");
            cw.writeTo(f1);
            cw.writeTo(f2);
            cw.writeTo(f3);

            cw.close();

            f1.close();
            f2.close();
            f3.close();
        }

        catch (Exception e){
            System.out.println(e);
        }




    }
}

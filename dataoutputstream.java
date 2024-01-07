package Filesinputandoutputstreams;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class dataoutputstream {
    public static void main(String[] args){
        try{
            FileOutputStream f=new FileOutputStream("D:\\File.txt");
            DataOutputStream d=new DataOutputStream(f);

            d.writeInt(67);
            d.writeUTF("Hello data OutputStream");
            d.writeChar(100);
            d.writeChars("Iam inserting primitive data values into output stream");
            d.flush();
            d.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

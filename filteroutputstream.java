package Filesinputandoutputstreams;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.util.logging.Filter;

public class filteroutputstream {
    public static void main(String[] args){
        try {
            FileOutputStream f = new FileOutputStream("D:\\File1.txt");
            FilterOutputStream fo = new FilterOutputStream(f);

            String s = "hello iam writing data into output stream using filteroutputstream";
            byte b[] = s.getBytes();

            fo.write(b);
            System.out.println(b);
            fo.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

package Filesinputandoutputstreams;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;

public class chararrayreader {
    public static void main(String[] args){
        try {
            char[] array={'V','I','K','R','A','M'};


        CharArrayReader cr=new CharArrayReader(array);

        int i=0;

        while (i!=-1) {
            System.out.print((char) i);
           i=cr.read();
        }
        cr.close();
        }
        catch (Exception e){
            System.out.println(e);
        }


    }
}

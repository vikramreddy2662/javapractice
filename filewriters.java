package Filesinputandoutputstreams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class filewriters {
    public static void main(String[]  args){
        try {
            FileWriter fw = new FileWriter("D:\\File.txt");

            fw.write("hello iam inserting the data using file writer");
            fw.write('c');
            fw.flush();
            fw.close();
        }
        catch (Exception e){

        }
        try{
            FileReader fr=new FileReader("D:\\File.txt");

            int i=0;
            while (i!=-1){
                System.out.print((char) i);
                i=fr.read();
            }
            fr.close();
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}

package Filesinputandoutputstreams;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;

/* Print stream provides various methods to write data of different types to another stream.
using print stream general character oriented data and as well as data of different datypes(primitive&non-primitive)*/
public class printstream {
    public static void main(String[] args) {
        try {
            FileOutputStream fo = new FileOutputStream("D:\\File.txt");
            PrintStream p = new PrintStream(fo);
            p.println(2019);
            p.println("hello iam inserting data of different data types into the another stream");
            p.println(4.5);
            p.println(false);
            p.close();
            fo.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}

package Filesinputandoutputstreams;

import java.io.*;

class bufferedoutputpstreamAndInput {
    public  static void main(String[] args){
        try {
            FileOutputStream f2 = new FileOutputStream("D:\\File2.txt");
            BufferedOutputStream b=new BufferedOutputStream(f2);

            String s="this is my the text into my second file";
            byte b2[]=s.getBytes();
            b.write(b2);
            System.out.println(b2);
            b.close();
        }
        catch (Exception e){

        }
        try {
            FileInputStream f1 = new FileInputStream("D:\\File.txt");
            FileInputStream f2 = new FileInputStream("D:\\File2.txt");
            BufferedInputStream b1=new BufferedInputStream(f1);
            BufferedInputStream b2=new BufferedInputStream(f2);

            SequenceInputStream s1=new SequenceInputStream(b1,b2);
            int j=s1.read();
            while (j!=-1){
                System.out.print((char) j);
                j=s1.read();
            }
            s1.close();
            b1.close();
            b2.close();

        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}

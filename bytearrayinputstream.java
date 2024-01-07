package Filesinputandoutputstreams;

import java.io.ByteArrayInputStream;

public class bytearrayinputstream {
    public static void main(String[] args){
        try{
        byte buf[]={78,45,93,67,89};//stream
        ByteArrayInputStream b=new ByteArrayInputStream(buf);
       //int i=0;
        int i=b.read();
        while(i!=-1){
            System.out.println((char) i);
            i=b.read();
        }}
        catch (Exception e){
            System.out.println(e);
        }
    }
}

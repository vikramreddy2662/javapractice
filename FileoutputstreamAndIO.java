    package Filesinputandoutputstreams;

    import java.io.FileOutputStream;

    class FileoutputstreamAndIO {
        public static void main(String[] args){
            try {
                FileOutputStream f=new FileOutputStream("D:\\File.txt");
                int i = 90;
                String s="hello vikram!";
                byte b[]=s.getBytes();
                f.write(i);
                f.write(b);

                System.out.println(b);
                System.out.println((char)i);

                f.close();
            }

            catch (Exception e){
                System.out.println(e);
            }
        }
    }

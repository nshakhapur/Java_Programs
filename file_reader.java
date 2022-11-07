import java.io.*;
public class file_reader {

    public static void main(String[] args)
    {
        try{
        FileReader out=new FileReader("file_text.txt");
        int i=out.read();
        while(i!=-1)
        {
            System.out.print((char)i);
            i=out.read();
        }
        out.close();

    }
    catch(Exception e)
    {
        System.out.print(e.getMessage());
    }
}
}

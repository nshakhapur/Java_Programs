import java.util.*;
import java.io.*;
public class file_stream_reader {
       public static void main(String[] args)
       {
        try{

        FileInputStream out= new FileInputStream("File_Stream.txt");
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

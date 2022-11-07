import java.util.*;
import java.io.*;
public class file_stream_writer {
    public static void main(String[] args)
    {  Scanner sc=new Scanner(System.in);
        try
        {
            FileOutputStream in=new FileOutputStream("File_Stream.txt");
            System.out.println("Type the message to be written in file: ");
            String msg=sc.nextLine();
            byte[] arr=msg.getBytes();
            in.write(arr);
            System.out.println("Message written!");


        }
        catch(Exception e)
        {
            System.out.print(e.getMessage());
        }
    }
}

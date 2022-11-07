import java.util.*;
import java.io.*;
public class file_writer 
{
   public static void main(String[] args) throws Exception
   {
    Scanner sc=new Scanner(System.in);
    try{
    FileWriter in=new FileWriter("file_text.txt");  
    System.out.println("Enter the message to be written in file: ");
    String msg=sc.nextLine();
    in.write(msg);
    in.flush();
    in.close();
} 
   catch(Exception e)
   {
    e.getMessage();
   }
}
}


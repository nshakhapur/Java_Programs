import java.io.*;
import java.util.*;
public class dat_writer {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        try{
        FileOutputStream out=new FileOutputStream("test.dat");
        System.out.println("Enter the message to write into the dat file: ");
            String message = sc.nextLine();

            byte[] arr = message.getBytes();

            out.write(arr);

            System.out.println("The Message has been successfully written in the dat file");

            sc.close();
            out.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }   
}

    
    


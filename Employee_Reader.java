import java.io.*;

public class Employee_Reader
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            FileInputStream in=new FileInputStream("Employee.dat");
            int i=in.read();
            
            while(i!=-1)
            {
                System.out.print((char)i);
                i=in.read();
            }
            
            in.close();
            
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
    }
}
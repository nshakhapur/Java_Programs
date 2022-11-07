import java.io.*;

public class dat_reader {

    public static void main(String[] args)
    {
        try{
            FileInputStream in=new FileInputStream("test.dat");
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
            e.getMessage();
        }
    }


    
}

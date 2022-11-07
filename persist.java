import java.io.*;
class persist 
{
    public static void main(String[] args)
    {
        Student s1=new Student(123,"ABC");
        try
        {
            //creating file to read the message
        FileOutputStream fout=new FileOutputStream("f.txt");
        // writing in the file
        ObjectOutputStream out= new ObjectOutputStream(fout);
        out.writeObject(s1);
        out.flush();
        out.close();
        
        System.out.println("Serialisation is successful");
    }
    catch(Exception e)
    {
        e.getMessage();
    }
}
}
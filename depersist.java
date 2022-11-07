import java.io.*;
class depersist
{
    public static void main(String[] args)
    {
        try
        {
            //creating a file to read the data
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
            Student s=(Student)in.readObject();
            // printing data of the serialised object 
            System.out.println(s.id+" "+s.name);
            //close the stream
            in.close();
            System.out.println("Deserialisation Complete");
            
        }
        catch(Exception e)
        {
            e.getMessage();
        }
    }
}
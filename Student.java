import java.util.*;
class Student
{
    void display(int a, String s)
    {
       System.out.println("Name: "+s+" Roll no: "+a);     

    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n=sc.nextInt();
         int[] r=new int[n];
         String[] x=new String[n];

        for(int i=0;i<n;i++)
        {
            
            System.out.println("Name: ");
            x[i]=sc.nextLine();
            
            System.out.println("Roll no: ");
            r[i]=sc.nextInt();
        }
          
        Student s=new Student();
        for(int i=0;i<n;i++)
        {
            s.display(r[i],x[i]);
        }
    }
}


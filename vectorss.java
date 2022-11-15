import java.util.*;
public class vectorss {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Vector<Integer> vec=new Vector<Integer>();
        System.out.println("Enter the number of elements: ");
        int n;
        n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            vec.add(i);
        }

        System.out.println("The vector is: "+vec);
        System.out.println("Enter the element to be deleted: ");
        int del;
        del=sc.nextInt();

        vec.remove(del);

        System.out.println("The edited vector is: "+vec);


    }
    
}

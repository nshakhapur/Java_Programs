import java.util.*;
public class StackPrgm {

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("****Implementing STACK****");
        System.out.println("Enter the number of elements: ");
        int x;
        x=sc.nextInt();
        Stack<String> stk=new Stack<String>();
        System.out.println("Enter the elements: ");
        String s;
        for(int i=0;i<x;i++)
        {
           s=sc.nextLine();
           stk.push(s);
        }
        Iterator<String> itr = stk.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");    
            System.out.println();
        }

        stk.pop();
        itr=stk.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next()+" ");
            System.out.println();
        }



    }
    
}

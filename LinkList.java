
import java.util.*;
public class LinkList 
{
 
    public static void main(String args[])
    {
        LinkedList<String> LL = new LinkedList<String>();

        for(int i=1;i<=5;i++)
    
        {
            String s="";
            s=s+(char)i;
            LL.add(i,s);

        }

        System.out.println("The Linked List is: "+LL);
        LL.remove(3);
        System.out.println("The new edited Linked List is: "+LL);


    }
}

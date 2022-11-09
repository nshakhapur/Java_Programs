import java.util.*;
import java.io.*;
public class arraylist
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list1= new ArrayList<String> ();
        ArrayList arr= new ArrayList();
        System.out.println("Implementing ArrayList<String> list= new ArrayList<String> () -> Adds only string");
        list1.add("Physics");
        list1.add("Chemistry");
        list1.add("Biology");
        arr.add("Science");
        arr.add(3.0);
        arr.add(100);
        System.out.println("Array List 1 is "+list1);
        System.out.println();
        System.out.println("Array List 2 is "+arr);
        System.out.println("Enter an element to be searched in list 1: ");
        String search=sc.nextLine();
        if(list1.contains(search))
        {
            System.out.println("Element "+search+ " Is found");
        }
        else{
            System.out.println("Element "+search+ " Is  NOT found");
        }

        System.out.println("Iterating with enhanced for loop");
        for(String str:list1)
        {
            System.out.println(str);
        }




    }
    
}
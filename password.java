import java.util.*;
public class password {


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String pass;
        int l=10;
        int ch=0;
        int dig=0;

        System.out.println("Enter password: ");
        pass=sc.nextLine();
        int n=pass.length();
        if(n<l)
        {
            System.out.println("Invalid password");
        }
        else
        {
            n=n-1;
            while(n!=-1)
            {
                char c=pass.charAt(n);
                if(Character.isAlphabetic(c))
                {
                    ch++;
                }
                if(Character.isDigit(c))
                {
                    dig++;
                }
                if(Character.isAlphabetic(c)==false && Character.isDigit(c)==false)
                {
                    System.out.println("Special character is not valid");
                    break;

                }
                n--;
            }


            if(dig<2)
            {
                System.out.println("Invalid password"); 
            }
            else
            {
                System.out.println("Valid password");
            }

        }


    }

    
}

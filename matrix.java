import java.util.*;
public class matrix {
    
    public static void main(String[] args)
    {
        int n,m;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        n=sc.nextInt();
        System.out.println("Enter number of coloumn: ");
        m=sc.nextInt();
        int[][] arr=new int[n][m];
        int eve=0;
        int odd=0;
        for(int i=0;i<n;i++)
        { 
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
                if(arr[i][j]%2==0)
                {
                    eve++;
                }
                else
                {
                    odd++;
                }
            }

        }
        for(int i=0;i<n;i++)
        { 
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Number of even digits are: "+eve+ " and odd digits are: "+odd);

    }
}

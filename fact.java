import java.util.*;
class fact
{
    public static void main(String args[])
    {
        int n,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        n=sc.nextInt();
        
        for( ;n>=1;n--)
        {
            fact=fact*n;
        }
        System.out.println(" factorial of number is " +fact);
    }
    
}
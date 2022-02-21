import java.util.Scanner;

 

class factwhile
{
    public static void main(String args[])
    {
        int i=1,n,fact=1;
        
         Scanner sc=new Scanner(System.in);
       System.out.println("enter any value");
        n=sc.nextInt();
          
        
        while (i<=n)
        {
            fact=fact*i; 
            i++;
        }
      System.out.println("factorial of "+n+" is :" +fact);
    }
}
import java.util.*;
class maximum
{
    public static void main(String args[])
    {
        int a,b,c;
        
         Scanner sc=new Scanner(System.in);
       System.out.println("Enter first number");
         a=sc.nextInt();
       System.out.println("Enter second number");
         b=sc.nextInt();
         System.out.println("Enter third number");
         c=sc.nextInt();
        
          if(a > b && a > b)
        {
            System.out.println("Largest number is:"+a);
        }
        else if(b>c)
        {
            System.out.println("Largest number is:"+b);
        }
        else
        {
            System.out.println("Largest number is:"+c);
        }
 
    }
}
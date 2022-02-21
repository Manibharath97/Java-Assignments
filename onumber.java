import java.util.*;
class onumber
{
    public static void main(String args[])
    {
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        n=sc.nextInt();
        
        for(i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                System.out.print("\t"+i);
            }
        }
         
    }
    
}
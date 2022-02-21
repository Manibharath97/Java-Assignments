import java.util.Scanner;
class forloopsum
{
    public static void main(String args[])
    {
        int i=1,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any value");
        n=sc.nextInt();
        
        for(i=1;i<=n;i++)
        {
            System.out.print("\t"+i);
            
        }
      
    }
}
import java.util.*;
class divisible
{
    public static void main(String args[])
    {
        int i,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter sum value:");
        sum=sc.nextInt();
        
        for(i=9;i<300;i++)
        {
            if(i%7==0 && i%63!=0)
            {sum=sum+i;}
        }
        System.out.println(" sum value is" +sum);
    }
    
}
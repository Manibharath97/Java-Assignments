import java.util.*;
class max3simpleif
{
    public static void main(String args[])
    {
        int a,b,c,max;
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a,b,c values:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        
        max=a;
        if(max<b)
            max=b;
        if(max<c)
            max=c;
            
        System.out.println("the maximum value is"+max);
       
    }
}
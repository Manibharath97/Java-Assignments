import java.util.*;
class calculator
{
    public static void main(String args[])
    {
        int a,b,c,ch;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("addition");
        System.out.println("subtraction");
        System.out.println("multiplication");
        System.out.println("division");
        
        System.out.println("enter your choice");
        ch=sc.nextInt();
        
        System.out.println("enter a,b,c values:");
         a=sc.nextInt();
         b=sc.nextInt();
         c=sc.nextInt();
         
         switch(ch)
         {
            case 1:
                 c=a+b;
                 System.out.println("addition value is:"+c);
                 break;
              
            case 2:
                 c=a-b;
                 System.out.println("subtraction value is:"+c);
                 break;
                
            case 3:
                 c=a*b;
                 System.out.println("multiplication value is:"+c);
                 break;    
                 
            case 4:
                 c=a/b;
                 System.out.println("division value is:"+c);
                 break;
                 
            default:
                System.out.println("invalid operator:");
    
                 
         }
        
    }
}
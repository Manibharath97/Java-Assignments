import java.util.*;
class alpha
{
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any character");
        ch=sc.next().charAt(0);
        
        switch(ch)
        {
            case 1:(ch='A'; c<='Z'; ++ch):
                System.out,println("it is alphabet :"+ch);
                break;
            
            default:
                System.out,println("enter alphabet only");
            
            
        }
    }
}
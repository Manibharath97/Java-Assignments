import java.util.*;

class scanner
{
    public static void main(String args[])
    {
        int length;
        int wwidth;
        int area=l*w;
        int circumference=2*(l+w);
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("length value is : ");
        length=sc.nextInt();
        System.out.println("width value is : ");
        width=sc.nextInt();
        
        System.out.println("area of rectangle is : " +area);
        System.out.println("circumferenceof rectangle is : " +circumference);
    }
}
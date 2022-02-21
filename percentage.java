import java.util.Scanner;
class percentage
{
    public static void main(String args[])
    {
         int p,c,b,m,com;
         float=percentage;
         
          Scanner sc=new Scanner(System.in);
        System.out.println("Enter physics marks");
        p=sc.nextInt();
         System.out.println("Enter chemistry marks");
        c=sc.nextInt();
         System.out.println("Enter biology marks");
        b=sc.nextInt();
        System.out.println("Enter maths marks");
        m=sc.nextInt();
         System.out.println("Enter computer marks");
        com=sc.nextInt();
        
        percentage=((p+c+b+m+com)/5);
    {
        if (percentage>=90)
        {
            System.out.println("Grade A");
        }
        else if (percentage>=80)
        {
            System.out.println("Grade B");
        }
         else if (percentage>=70)
        {
            System.out.println("Grade C");
        }
        else if (percentage>=60)
        {
            System.out.println("Grade D");
        }
         else if (percentage>=40)
        {
            System.out.println("Grade E");
        }
         else if (percentage<40)
        {
            System.out.println("Grade F");
        }
    }
}
}
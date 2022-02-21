import java.util.*;
class reverse
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      String st1,st2=" ";
      System.out.println("Enter a string:");
      String st1= in.next();
     String st2= in.next();
     
       
       for(int i=st1.length()-1;i>=0;i--)
       {
           st2=st2+st1.charAt(i);
           
           System.out.println("the reverse of the given string"+st2);
       }
    }
}
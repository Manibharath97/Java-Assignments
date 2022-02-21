import java.util.*;
class reverse
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a string:");
      String str= in.next();
     
       String words[]=str.split(" ");
       
       for(int i=words.length-1;i>=0;i--)
       {
           System.out.print(words[i]+" ");
       }
    }
}
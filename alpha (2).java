import java.util.*;
class alpha
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter  words");
      String str= in.next();
        int acount=0;
       String words[]=str.split(" ");
       
       for(int i=0;i<words.length;i++)
       {     
           for(int j=0;j<words[i].length();j++)
           { 
               if(words[i].charAt(j)>='A' && words[i].charAt(j)<='Z' || words[i].charAt(j)>='a' && words[i].charAt(j)<='z' )
               {
                     acount++;
               }
           }
           System.out.println("No. of alphabets in "+words[i]+" is : "+acount);
           acount=0;      
       }
    }
}
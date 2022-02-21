import java.util.Scanner;
class positive
{
 
   public static void main(String[] args){
    
    Scanner s = new Scanner(System.in);
      
  int n =s.nextInt();
        if(n>0){
    
        System.out.println("num is postive");
 
       }else if(n<0){
           
 System.out.println("num is negative");
 
       }else{
           
 System.out.println("num is zero");
  
      }
    }
    
}
import java.util.Scanner;
class conversion
{
    public static void main(String args[])
    {
     float fahrenheit;
     float celsius;
    
     Scanner sc=new Scanner(System.in);
    
     System.out.print("fahrenheit value: ");
     fahrenheit=sc.nextFloat();
    
    
     celsius=((fahrenheit-32)*0.555);
    
     System.out.println("temperature in celsius is :"+celsius);
    }
}
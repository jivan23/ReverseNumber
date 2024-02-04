import java.util.Scanner;
import java.util.*;


class ReverseNumber
{
    public static void main(String arr[]) 
    {
        System.out.println("Jai Shree Ram..!!");

        int revNumber = 0;
        
        System.out.println(" Enter your number : ");
        Scanner jivan = new Scanner(System.in);
        int number = jivan.nextInt();

        while(number>0)
        {
            int ld = number%10;
            revNumber =revNumber *10+ ld;
            number = number / 10;

        }
        System.out.println(  " The reverse number is : " + revNumber);

        int OrgNumber = number;
    
        if(revNumber == OrgNumber)
        {
           System.out.println(" The entered number is not palindrome...");
        }  
        else
        {
             System.out.println(" The entered number is palindrome ");
            
        }
    }
}

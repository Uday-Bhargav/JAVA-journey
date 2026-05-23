//Check if a number is palindrome or not

import java.util.*;

public class palindrome
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = scn.nextInt();

        int rev = 0 , rem ;
        int temp = n;

        for(; n > 0 ; n = n / 10)
        {
            rem = n % 10;
            rev = rev * 10 + rem;
        }
        if(temp == rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }

        scn.close();
    }
}
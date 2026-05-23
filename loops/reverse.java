//Reverse the digits of a number

import java.util.*;

public class reverse
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = scn.nextInt();

        int rev = 0 , rem ;
        for(; n > 0 ; n = n / 10)
        {
            rem = n % 10;
            rev = rev * 10 + rem;
        }
        System.out.println(rev);

        scn.close();
    }
}
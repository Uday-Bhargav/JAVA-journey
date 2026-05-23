//Sum of digits of a number

import java.util.*;

public class digit_sum
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = scn.nextInt();

        int digit , sum = 0;
        for(; n > 0 ; n = n / 10)
        {
            digit = n % 10;
            sum += digit;
        }
        System.out.println(sum);

        scn.close();
    }
}
//Count the digits of a number

import java.util.*;

public class digit_count
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = scn.nextInt();

        int rem , count = 0;
        for(; n > 0 ; n = n / 10)
        {
            rem = n % 10;
            count++;
        }
        System.out.println(count);

        scn.close();
    }
}
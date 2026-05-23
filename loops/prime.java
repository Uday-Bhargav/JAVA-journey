//Check if a number is prime or not

import java.util.*;

public class prime
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = scn.nextInt();

        int count = 0;
        for(int i = 1 ; i <= n ; i++)
        {
            if(n % i == 0)
            {
               count++;
            }
        }
        if(count == 2)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not prime");
        }

        scn.close();
    }
}
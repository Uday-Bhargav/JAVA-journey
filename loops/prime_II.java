//Print prime numbers between 1 to n

import java.util.*;

public class prime_II
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = scn.nextInt();

        int cnt = 0;
        for(int i = 2 ; i <= n ; i++)
        {
            int count = 0;
            for(int j = 1 ; j <= i ; j++)
            {
               if(i % j == 0)
               {
                  count++;
               }
            }
            
            if(count == 2)
            {
                System.out.print(i + " ");
                cnt++;
            }
        }
        System.out.println("\n Total prime numbers under " + n + " is : " + cnt);

        scn.close();
    }
}
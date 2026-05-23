//Print sum of numbers from 1 to n

import java.util.*;

public class sum
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = scn.nextInt();

        int sum = 0;
        for(int i = 1 ; i <= n ; i++)
        {
            sum += i;
        }
        System.out.println(sum);

        scn.close();
    }
}
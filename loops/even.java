//Print even numbers from 1 to n

import java.util.*;

public class even
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = scn.nextInt();

        for(int i = 0 ; i <= n ; i++)
        {
            if(i % 2 == 0)
            {
            System.out.println(i);
            }
        }

        scn.close();
    }
}
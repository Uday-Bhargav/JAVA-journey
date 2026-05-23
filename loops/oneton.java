//Print numbers from 1 to n

import java.util.*;

public class oneton
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = scn.nextInt();

        for(int i = 0 ; i < n ; i++)
        {
            System.out.println(i);
        }

        scn.close();
    }
}
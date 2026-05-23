//Print numbers from n to 1

import java.util.*;

public class ntoone
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = scn.nextInt();

        for(int i = n ; i >= 0 ; i--)
        {
            System.out.println(i);
        }

        scn.close();
    }
}
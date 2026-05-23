//Print fibonacci series upto n

import java.util.*;

public class fibonacci
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = scn.nextInt();

        int a = 0;
        int b = 1;
        int c;
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(a + " ");
            
            c = a + b;
            a = b;
            b = c;
        }

        scn.close();
    }
}
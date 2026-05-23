//Print fibonacci series upto n

import java.util.*;

public class while1
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = scn.nextInt();

        int a = 0;
        int b = 1;
        int c;
        int i = 0;
        while( i < n )
        {
            System.out.print(a + " ");
            
            c = a + b;
            a = b;
            b = c;

            i++;
        }

        scn.close();
    }
}
//Print factorial of n

import java.util.*;

public class factorial
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = scn.nextInt();

        int fact = 1;

        for(int i = n ; i >= 1 ; i--)
        {
            fact *= i;
        }
        System.out.println("Factorial of " + n +  " is : " + product);

        scn.close();
    }
}
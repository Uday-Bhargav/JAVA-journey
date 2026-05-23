//Multiplication table of number n

import java.util.*;

public class mt
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = scn.nextInt();

        int multiply;
        for(int i = 1 ; i <= 10 ; i++)
        {
            multiply = n * i;
            System.out.println(n + " X " + i +  " = " + multiply);
        }

        scn.close();
    }
}
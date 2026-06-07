//A number is Strong if:
//Sum of factorials of digits = original number

import java.util.*;

public class strong_number
{
    //Helper function to calculate the factorial of each digit
    static int factorial(int num)
    {
        int fact = 1;
        for(int i = 1 ; i <= num ; i++)
        {
            fact *= i;
        }
        return fact;
    }

    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = scn.nextInt();

        int temp = n;
        int digit , sum = 0;

        for(; n > 0 ; n = n / 10)
        {
            digit = n % 10;
            sum += factorial(digit);
        }

        if(temp == sum)
        {
            System.out.println("Strong number , " + sum);
        }
        else
        {
            System.out.println("Not a Strong number , " + sum);
        }

        scn.close();
    }
}
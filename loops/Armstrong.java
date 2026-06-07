//Armstrong number

import java.util.*;

public class Armstrong
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int digit , cube , sum = 0;
        int temp = n;
        
        for(; n > 0 ; n = n / 10)
        {
            digit = n % 10;
            cube = digit * digit * digit;
            sum += cube ;
        }

        if(temp == sum)
        {
            System.out.println("Armstong");
        }
        else
        {
            System.out.println("Not armstrong");
        }

        sc.close();
    }
}
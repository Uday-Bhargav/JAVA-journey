//hcf / gcd of two numbers 

import java.util.*;

public class hcf
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :" );
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("Enter second number :" );
        int b = Integer.parseInt(sc.nextLine());

        int hcf = 1;
        for(int i = 1 ; i <= a && i <= b ; i++)
        {
            if(a % i == 0 && b % i == 0)
            {
                hcf = i;
            }
        }

        System.out.println("HCF / GCD : " + hcf);

        sc.close();
    }

}
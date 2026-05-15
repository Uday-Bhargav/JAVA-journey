//Check divisibility by 5 and 11

import java.util.*;

public class divisibility
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number to check divisibility : ");
        int num = Integer.parseInt(scn.nextLine());

        if(num % 5 == 0 && num % 11 == 0)
        {
            System.out.println("Divisible");
        }
        else{
            System.out.println("Not divisible");
        }

        scn.close();
    }
}
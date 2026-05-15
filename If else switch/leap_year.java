//Check if leap year or not.

import java.util.*;

public class leap_year
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter year to check : ");
        int year = Integer.parseInt(scn.nextLine());

        if(year % 4 == 0 && year % 100 != 0)
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }

        scn.close();
    }
}
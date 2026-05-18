//Find absolute value

import java.util.*;

public class absolute
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a negative value : ");
        int a = Integer.parseInt(scn.nextLine());

        if(a < 0)
        {
            a = a * -1;
        }

        System.out.print("Absolute value is : " + a);

        scn.close();
    }
}
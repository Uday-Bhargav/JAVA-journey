//Check traingle valid or not

import java.util.Scanner;

public class valid_triangle
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter side a of triangle : ");
        int a = Integer.parseInt(scn.nextLine());
        System.out.print("Enter side b of triangle : ");
        int b = Integer.parseInt(scn.nextLine());
        System.out.print("Enter side c of triangle : ");
        int c = Integer.parseInt(scn.nextLine());

        if((a + b > c) && (a + c > b) && (b + c > a))
        {
            System.out.print("Valid triangle");
        }
        else
        {
            System.out.print("Invalid triangle");
        }

        scn.close();
    }
}
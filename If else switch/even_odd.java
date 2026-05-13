//Check if the element is even or odd.

import java.util.Scanner;

public class even_odd
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int a = Integer.parseInt(scn.nextLine());

        if(a % 2 == 0)
        {
            System.out.println("Even");
        }else
        {
            System.out.println("Odd");
        }

        scn.close();
    }
}
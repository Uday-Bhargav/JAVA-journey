//Check if a number is positive ,negative or zero.

import java.util.Scanner;

public class positive_negative
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = Integer.parseInt(scn.nextLine());

        if(num > 0)
        {
            System.out.println("Positive");
        }
        else if(num < 0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("zero");
        }

        scn.close();
    }
}
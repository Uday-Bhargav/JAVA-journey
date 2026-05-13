//Largest of two numbers

import java.util.Scanner;

public class comparision
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter two numbers : ");
        int a = Integer.parseInt(scn.nextLine());
        int b = Integer.parseInt(scn.nextLine());

        if(a > b)
        {
            System.out.println(a + " is greater");
        }
        else if(a < b)
        {
            System.out.println(b + " is greater");
        }
        else
        {
            System.out.println("Both numbers are equal");
        }

        scn.close();
    }
}
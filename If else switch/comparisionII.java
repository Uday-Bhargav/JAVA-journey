//Largest of three numbers.

import java.util.Scanner;

public class comparisionII
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter three numbers : ");
        int a = Integer.parseInt(scn.nextLine());
        int b = Integer.parseInt(scn.nextLine());
        int c = Integer.parseInt(scn.nextLine());

        if(a > b && a > c)
        {
            System.out.println(a + " is greater ");
        }
        else if(b > a && b > c)
        {
            System.out.println(b + " is greater ");
        }
        else
        {
            System.out.println(c + " is greater ");
        }

        scn.close();
    }
}
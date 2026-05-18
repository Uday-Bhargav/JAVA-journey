//Find greatest using ternary operator

import java.util.*;

public class ternary
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter two numbers : ");
        int a = Integer.parseInt(scn.nextLine());
        int b = Integer.parseInt(scn.nextLine());

        int compare = (a > b) ? a : b;

        System.out.println(compare);

        scn.close();
    }
}
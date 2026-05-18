//Simple calculator for two numbers

import java.util.*;

public class simple_calculator
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter first number : ");
        double a = Double.parseDouble(scn.nextLine());
        
        System.out.print("Enter second number : ");
        double b = Double.parseDouble(scn.nextLine());

        System.out.print("Enter operator (+ , - , / , *) :");
        char op = scn.nextLine().trim().charAt(0);

        if(op == '+')
        {
            System.out.println(a + " + " + b + " = " + (a + b));        
        }
        else if(op == '-')
        {
            System.out.println(a + " - " + b + " = " + (a - b));        
        }
        else if(op == '/')
        {
            System.out.println(a + " / " + b + " = " + (a / b));        
        }
        else if(op == '*')
        {
            System.out.println(a + " * " + b + " = " + (a * b));        
        }
        else
        {
            System.out.println("OOPs !! Wrong operator....");
        }

        scn.close();
    }
}
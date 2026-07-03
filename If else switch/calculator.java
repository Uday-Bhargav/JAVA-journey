//Simple calculator using switch case

import java.util.*;

public class calculator
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter two numbers : ");
        int a = Integer.parseInt(scn.nextLine());
        int b = Integer.parseInt(scn.nextLine());
        System.out.println("Enter a operator(+ , - , / , *) : ");
        char op = scn.next().trim().charAt(0);
 
        switch(op)
        {
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                System.out.println(a + " / " + b + " = " + (a / b));
                break;
            default :
                System.out.println("Enter a valid operator...");                
        }

        scn.close();
    }
}
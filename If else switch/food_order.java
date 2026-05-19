//Basic food ordering java

import java.util.*;

public class food_order
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number between 1 to 5 for or ordering food : ");
        int food = Integer.parseInt(scn.nextLine());

        switch(food)
        {
            case 1:
                System.out.println("You ordered @ Dal Fry");
                System.out.println("price : 149/-");
                break;
            case 2:
                System.out.println("You ordered @ Jeera Rice");
                System.out.println("price : 169/-");
                break;
            case 3:
                System.out.println("You ordered @ Kadhai Paneer");
                System.out.println("price : 210/-");
                break;
            case 4:
                System.out.println("You ordered @ Naan Roti(2 pcs)");
                System.out.println("price : 42/-");
                break;
            case 5:
                System.out.println("You ordered @ Gulaab Jamun(2 pcs)");
                System.out.println("price : 149/-");
                break;
            default:
                System.out.println("Enter a valid number...");    
        }
        scn.close();
    }
}
//Program for printing name of month using switch case

import java.util.*;

public class month_day
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number betwen 1 to 12 : ");
        int month = Integer.parseInt(scn.nextLine());

        switch(month)
        {
            case 1 :
                System.out.println("January : 31 days");
                break;
            case 2 :
                System.out.println("February : 28 or 29 days");
                break;
            case 3 :
                System.out.println("March : 31 days");
                break;
            case 4 :
                System.out.println("April : 30 days");
                break;
            case 5 :
                System.out.println("May : 31 days");
                break;
            case 6 :
                System.out.println("June : 30 days");
                break;
            case 7 :
                System.out.println("July : 31 days");
                break;
            case 8 :
                System.out.println("August : 31 days");
                break;
            case 9 :
                System.out.println("September : 30 days ");
                break;
            case 10 :
                System.out.println("October : 31 days");
                break;
            case 11 :
                System.out.println("November : 30 days");
                break;
            case 12 :
                System.out.println("December : 31 days");
                break;    
            default :
                System.out.println("Enter a valid month number...");
        }

        scn.close();
    }
}
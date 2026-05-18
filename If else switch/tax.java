//Calculate income tax

import java.util.Scanner;

public class tax
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your income : ");
        double income = Double.parseDouble(scn.nextLine());

        double tax;

        if(income <= 400000)
        {
            System.out.println("No income tax");
        }
        else if(income > 400000 || income <= 800000)
        {
            tax = (income * 5) / 100;
            System.out.println("5% tax on income above 4,00,000 and below 8,00,000");
            System.out.println("Income tax is " + tax );
        }
        else if(income > 800000 || income <= 1200000)
        {
            tax = (income * 10) / 100;
            System.out.println("10% tax on income above 8,00,000 and below 12,00,000");
            System.out.println("Income tax is " + tax );
        }
        else if(income > 1200000 || income <= 1600000)
        {
            tax = (income * 15) / 100;
            System.out.println("15% tax on income above 12,00,000 and below 16,00,000");
            System.out.println("Income tax is " + tax );
        }
        else if(income > 1600000 || income <= 2000000)
        {
            tax = (income * 20) / 100;
            System.out.println("20% tax on income above 16,00,000 and below 20,00,000");
            System.out.println("Income tax is " + tax );
        }
        else if(income > 2000000 || income <= 2400000)
        {
            tax = (income * 25) / 100;
            System.out.println("25% tax on income above 20,00,000 and below 24,00,000");
            System.out.println("Income tax is " + tax );
        }
        else if(income > 2400000)
        {
            tax = (income * 30) / 100;
            System.out.println("30% tax on income above 24,00,000");
            System.out.println("Income tax is " + tax );
        }

        scn.close();
    }
}
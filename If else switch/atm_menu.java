/*Atm menu program using java showing balance , deposit and
  withdraw money and exit.*/

import java.util.Scanner;

public class atm_menu
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Current Balance : ");
        int balance = 1000;

        System.out.println("======ATM Menu======");
        System.out.println("1.Check balance");
        System.out.println("2.deposit money");
        System.out.println("3.Withdraw money");
        System.out.println("4.Exit");
        System.out.println("5.Fast cash");


        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1 :
                System.out.print("Your current balance is : " + balance);
                break;

            case 2 :
                System.out.print("Enter money to deposit : ");
                int deposit = sc.nextInt();

                balance = balance + deposit;

                System.out.println("Deposited " + deposit + "in your bank account");
                System.out.print("Updated balance is : " + balance);
                break;

            case 3 :
                System.out.print("Enter withdrawal amount : ");
                int withdraw = sc.nextInt();

                if(withdraw <= balance)
                {
                    balance = balance - withdraw;
                    System.out.println("Withdrawn " + withdraw + " from bank account");
                    System.out.print("Updated balance is : " + balance);
                }
                else
                {
                    System.out.println("Insufficient balance");
                }
                break;

            case 4 :
                System.out.print("Thank you for using ATM");
                break;

            case 5 :
                System.out.println("fast cash = 500");
                if(balance >= 500)
                {
                    balance = balance - 500;
                    System.out.println("Withdrawn 500 from bank account");
                    System.out.println("Updated balance is : " + balance);
                }
                else
                {
                    System.out.println("Insufficient balance");
                }
                break;

            default :
                System.out.println("Invalid choice , Please enter a valid choice...");
        }

        sc.close();
    }
}
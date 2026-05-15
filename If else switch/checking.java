//Check alphabet or digit or special character

import java.util.Scanner;

public class checking
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter something to check : ");
        char ch = scn.next().charAt(0);
        //charAt(0) extracts the first character from the string 
        //that is taken through scn.next()

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
        {
            System.out.println(ch + " is a Alphabet");
        }
        else if(ch >= '0' && ch <= '9')
        {
            System.out.println(ch + " is a Digit");
        }
        else
        {
            System.out.println(ch + " is a Special character");
        }

        scn.close();
    }
}
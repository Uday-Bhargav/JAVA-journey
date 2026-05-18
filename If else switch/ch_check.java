//Character case check

import java.util.*;

public class ch_check
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a character : ");
        char ch = scn.next().charAt(0);

        if(ch >= 'a' && ch <= 'z')
        {
            System.out.print("Lowercase character");
        }
        else if(ch >= 'A' && ch <= 'Z')
        {
            System.out.print("Uppercase character");
        }
        else
        {
            System.out.print("Enter a valid character");
        }

        scn.close();
    }
}
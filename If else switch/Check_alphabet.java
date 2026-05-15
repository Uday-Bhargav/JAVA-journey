//Check vowel or consonant

import java.util.*;

public class Check_alphabet
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a alphabet : ");
        String str = scn.next();

        if(str.equals("a")|| str.equals("e")|| str.equals("i")|| str.equals("o")||str.equals("u"))
        {
            System.out.println(str + " is a vowel");
        }
        else
        {
            System.out.println(str + " is a consonant");
        }

        scn.close();
    }
}
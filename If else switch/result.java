//check pass or fail

import java.util.*;

public class result
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter marks of maths : ");
        double maths = Double.parseDouble(scn.nextLine());

        System.out.print("Enter marks of physics : ");
        double physics = Double.parseDouble(scn.nextLine());

        System.out.print("Enter marks of chemistry : ");
        double chemistry = Double.parseDouble(scn.nextLine());

        System.out.print("Enter marks of hindi : ");
        double hindi = Double.parseDouble(scn.nextLine());

        System.out.print("Enter marks of english : ");
        double english = Double.parseDouble(scn.nextLine());

        double total = maths + physics + chemistry + hindi + english ;
        double percent = total / 5 ;

        if(maths < 33 || physics < 33 || chemistry < 33 || hindi < 33 || english < 33)
        {
            System.out.println("Result : fail due to less marks in one or more subjects , total percent is : " + percent );
        }
        else if(percent >= 33)
        {
            System.out.println("Total percent : " + percent);
            System.out.println("Result : pass");
        }
        else if(percent < 33)
        {
            System.out.println("Result :fail ( " + percent + " ) ");
        }

        scn.close();
    }
}
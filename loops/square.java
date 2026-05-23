import java.util.*;

public class square
{
    public static void main(String [] agrs)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = scn.nextInt();

        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                System.out.print("* ");
            }

            System.out.println(" ");
        }

        scn.close();
    }
}
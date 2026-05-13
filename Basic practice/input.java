import java.util.Scanner; //Library containing scanner class.

public class input
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in); //Scanner object.

        System.out.println("Enter a sentence:");
        String str = scn.nextLine();
        System.out.println("Entered a sentence:" + str);
        
        //For taking multiple inputs , Use 'parse' with the datatype keyword.

        System.out.println("Enter a number:");
        int a = Integer.parseInt(scn.nextLine());
        System.out.println("Entered a number:" + a);

        System.out.println("Enter a decimal number : ");
        double b = Double.parseDouble(scn.nextLine());
        System.out.println("Entered a decimal number : " + b);

        scn.close(); //Good practice to close scanner after using.
    }
}
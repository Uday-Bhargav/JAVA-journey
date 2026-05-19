//Java 17 new feature for switch 

public class new_switch
{
    public static void main(String [] args )
    {
        String day = "Sunday";
        String result = " ";

        result = switch(day){ //Used switch as an expression
            case "Sunday" -> "8 am"; //instead of using System.out.print...we can directly use -> and store value in result variable.
            case "Saturday" -> "7 am";//instead of using break we can use yield fn that works same as break
            default -> "6 am";
            //we can also use : yield " output ";
        };

        System.out.println(result);
    }
}
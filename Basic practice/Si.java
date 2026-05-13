public class si
{
    public static void main(String []args)
    {
        int principal = 10000;
        double rate = 4.5;
        int time = 2;

        double SI = (principal * rate * time) / 100;

        System.out.println("Simple interest : " + SI);
    }
}
public class comp
{
    public int max (int a , int b)
    {
        if(a > b)
          return a;
        else
          return b;  
    }

    public static void main(String args[])
    {
        comp obj = new comp();
        System.out.println(obj.max(2 , 4));
    }
}
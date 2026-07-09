class specs
{
    String brand;
    String color;
    int price;
}

public class Car
{
    public static void main(String args[])
    {
        specs obj = new specs();

        obj.brand = "TATA";
        obj.color = "Silver";
        obj.price = 5_55_000;

        System.out.println("Brand : " + obj.brand);
        System.out.println("Color : " + obj.color);
        System.out.println("Price : " + obj.price);
    }
}
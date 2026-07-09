import java.util.Scanner;

class details
{
    String title;
    String author;
    int pages;
}

public class Book
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        details obj = new details();

        System.out.println("Enter book title : ");
        obj.title = sc.nextLine();

        System.out.println("Enter Author name : ");
        obj.author = sc.nextLine();
        
        System.out.println("Enter total pages : ");
        obj.pages = sc.nextInt();

        System.out.println("--------------Book Details--------------");
        System.out.println("Book Title : " + obj.title);
        System.out.println("Author name : " + obj.author);
        System.out.println("Total pages : " + obj.pages);

        sc.close();
    }
}
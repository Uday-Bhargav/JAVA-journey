class Student
{
    String name;
    int age;
}

public class MainII
{
    public static void main(String args[])
    {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Uday";
        s1.age = 20;

        s2.name = "Ultra";
        s2.age = 21;

        System.out.println("Student 1");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println("Student 2");
        System.out.println(s2.name);
        System.out.println(s2.age);
    }
}
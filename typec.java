//Type conversion & type casting

class type
{
    public static void main(String a[])
    {
        float f = 5.6f;
        int i = (int) f;
        //Type casting : Explicit type conversion

        int j = 257; //This value is out of range of byte so in the backend
        //it will divide 257 with the help of % modulus operator with 256
        //that will give 1.
        byte b = (byte) j;

        //This is called type promotion provided by java.
        byte c = 10;
        byte d = 20;

        int result = c * d;

        System.out.println(result);
    }
}
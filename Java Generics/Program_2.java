public class Program_2
{
    public static void main (String[] args)
    {
        Object obj[] = new Object[3];

        obj[0] = "hi";
        obj[1] = "Java";
        obj[2] = 10;

        String str;

        for (int i=0; i<3; i++)
        {
            str = (String) obj[i];
            System.out.println(str);
        }

        // this is runtime error
        // type of object is checked at runtime, not during compile time
    }
}

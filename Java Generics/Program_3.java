public class Program_3<T>
{
    T[] arr = (T[]) new Object[3];

    public static void main (String[] args)
    {
        Program_3 <String>a = new Program_3();

        a.arr[0] = "hi";
        a.arr[1] = "bye";
        a.arr[2] = "Java";

        String s1 = a.arr[0]; // no type casting requires
        String s2 = a.arr[1];
        String s3 = a.arr[2];

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

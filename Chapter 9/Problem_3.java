public class Problem_3
{
    public static void main(String[] args)
    {
        java.util.Date date = new java.util.Date();

        long[] times = new long[] 
        {
            10000, 100000, 1000000, 10000000, 100000000, 1000000000,
            10000000000L, 100000000000L
        };

        for (int i = 0; i < times.length; i++)
        {
            date.setTime(times[i]);
            System.out.println(date.toString());
        }
    }
}

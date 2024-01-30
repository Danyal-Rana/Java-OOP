import java.util.*;

public class Problem_4
{
    public static void main(String[] args)
    {
        Random rand = new Random(1000);

        for (int i = 0; i < 50; i++)
        {
            System.out.println (rand.nextInt(100));
        }
    }
}

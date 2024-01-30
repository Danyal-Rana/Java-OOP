import java.util.*;

public class Rougt
{
    public static void main (String[] args)
    {
        int max = 100;
        int min = 0;

        Random rand = new Random();

        int num = rand.nextInt(max - min+1) + min;

        System.out.print (num);
    }
}
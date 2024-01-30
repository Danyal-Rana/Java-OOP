import java.util.Scanner;

public class Program_4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print ("How many numbers do you want to compare: ");
        int x = input.nextInt();

        System.out.print ("Enter the number: ");
        int firstNum = input.nextInt();

        int min = firstNum;
        int max = 0;
        

        for (int i=1; i<x; i++)
        {
            System.out.print ("Enter the number: ");
            int num = input.nextInt();

            if (num>firstNum)
            {
                max = num;
            }
            if (num<firstNum)
            {
                min = num;
            }
        }

        int sum = max + min;
        System.out.println (sum);

        System.out.println ("The greatest of entered numbers is: " +max);
        System.out.println ("The greatest of entered numbers is: " +min);
        System.out.println ("The sum of greatest and smallest number is: " +sum);
        input.close();
    }
}
import java.util.*;

public class Program_13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int marks = 0;

        while (marks != -1)
        {
            System.out.print("Enter the marks (or enter -1 to exit): ");
            marks = sc.nextInt();

            if (marks>=60)
            {
                System.out.println ("You are Pass");
            }
            else if (marks != -1)
            {
                System.out.println ("You are Fail");
            }
        }

        sc.close();
    }
}
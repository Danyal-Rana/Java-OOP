import java.util.Scanner;

public class Program_5
{
    public static void main(String[] args) {
        
        Scanner io = new Scanner(System.in);

        System.out.print ("Enter the first number: ");
        int n1 = io.nextInt();

        System.out.print ("Enter the second number: ");
        int n2 = io.nextInt();

        System.out.print ("Enter the third number: ");
        int n3 = io.nextInt();

        float average = (n1+n2+n3)/3;

        System.out.println ("The average of entered numbers is: " + average);
        io.close();
    }
}
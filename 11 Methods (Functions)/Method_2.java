import java.util.Scanner;

public class Method_2 {
    public static int Sum (int a, int b) {

        int sum = a+b;
        System.out.print (sum);
        return sum;
    }

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print ("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print ("Enter the second number: ");
        int b = sc.nextInt();

        System.out.print ("The sum of the entered numbers is: ");
        Sum(a, b);

        sc.close();
    }
}

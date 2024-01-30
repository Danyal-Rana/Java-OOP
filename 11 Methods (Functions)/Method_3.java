import java.util.Scanner;

public class Method_3 {

    public static int calculateProduct (int a, int b) {

        return a*b;
    } public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print ("Enter the first number: ");
        int x = sc.nextInt();
        System.out.print ("Enter the second number: ");
        int y = sc.nextInt();

        System.out.print ("The product of two entered numbers is: "+ calculateProduct(x, y));

        sc.close();
    }
}
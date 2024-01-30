import java.util.Scanner;

public class Factorial {

    public static void calculateFactorial (int a) {

        if (a<0) {
            System.out.println ("Invlaid number");
            return;
        } else if (a==0) {
            System.out.println ("The factorial of 0 is 1.");
            return;
        } else {
            int f = 1;
        for (int i=1; i<=a; i++) {
            f = f*i;
        }
        System.out.print ("The factorial of entered number " +a+ " is "+ f);
        return;            
        }
        
    }

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print ("Enter the number: ");
        int x = sc.nextInt();

        calculateFactorial(x);
        sc.close();
    }
}
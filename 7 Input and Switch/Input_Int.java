import java.util.Scanner;

public class Input_Int {
    public static void main (String[] args) {
        
        Scanner number = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int n = number.nextInt();
            System.out.println (n*5);
        } finally {
            number.close();
        }
    }
}
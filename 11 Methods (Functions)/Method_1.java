import java.util.Scanner;

public class Method_1 {
    public static void printName (String name) {
        System.out.println (name + " is a good name.");
        return;
    }

    public static void main (String [] args) {

        System.out.print ("Enter the name: ");
        Scanner sc = new Scanner (System.in);
        String name = sc.next();

        printName (name);

        sc.close();
    }
}
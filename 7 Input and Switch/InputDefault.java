import java.util.Scanner;

public class InputDefault {
    public static void main (String[] args) {
        System.out.println ("Enter your username: ");

        Scanner myObj = new Scanner(System.in);

        try {     
        String userName = myObj.nextLine();
        System.out.println ("Your username is: "+userName);
        }
        finally {
            myObj.close();
        }
    }
}
import java.util.Scanner;

public class Arrays_2d {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print ("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print ("Enter the number of columns: ");
        int cols = sc.nextInt();

        int [][] numbers = new int [rows] [cols];

        for (int i=0; i<rows; i++) {
            System.out.println ("Enter the values for row " + i);
            for (int j=0; j<cols; j++) {
                numbers [i][j] = sc.nextInt();
            }
        }
        System.out.print ("Enter the number whose index has to find: ");
        int x = sc.nextInt();

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.println (x + " is located at "+ i + "*" + j );
                }
            }
        }
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                System.out.print (numbers[i][j] + " ");
            }
            System.out.println ();
        }

        sc.close();
    }
}

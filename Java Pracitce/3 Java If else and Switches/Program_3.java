import java.util.Scanner;

public class Program_3
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int digits = input.nextInt();

        int d9 = digits % 10;
        digits /= 10;
        int d8 = digits % 10;
        digits /= 10;
        int d7 = digits % 10;
        digits /= 10;
        int d6 = digits % 10;
        digits /= 10;
        int d5 = digits % 10;
        digits /= 10;
        int d4 = digits % 10;
        digits /= 10;
        int d3 = digits % 10;
        digits /= 10;
        int d2 = digits % 10;
        digits /= 10;
        int d1 = digits % 10;

        int checksum = d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9;
        int d10 = checksum % 11;

        System.out.print("The ISBN-10 number is ");
        System.out.print(d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9);
        if (d10 == 10) {
            System.out.println("X");
        } else {
            System.out.println(d10);
        }

        input.close();
    }
}
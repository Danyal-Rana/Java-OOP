import java.util.Scanner;

public class Program_4
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print ("Enter the radius of the circle: ");

        double radius = input.nextDouble();

        double area = 3.14*radius*radius;

        double perimeter = 2*3.14*radius;

        System.out.println ("The Area of the circle is: " +area);

        System.out.println ("The Perimeter of the circle is: " +perimeter);

        input.close();
    }
}
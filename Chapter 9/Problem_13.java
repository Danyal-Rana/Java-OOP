import java.util.Scanner;

class Location
{
    public int row;
    public int column;
    public double maxValue;

    public Location () {}

    public Location (int row, int column, double maxValue)
    {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static Location locateLargest (double[][] a)
    {
        int row = 0;
        int column = 0;
        double maxValue = a[0][0];

        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[0].length; j++) 
            {
                if (a[i][j] > maxValue)
                {
                    row = i;
                    column = j;
                    maxValue = a[i][j];
                }
            }
        }

        return new Location(row, column, maxValue);
    }
}

public class Problem_13
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        double[][] myDouble = new double[rows][columns];

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                System.out.print("Enter the value of row " + i + " and column " + j + ": ");
                myDouble[i][j] = sc.nextDouble();
            }
        }

        Location myLocation = Location.locateLargest(myDouble);

        System.out.println("The location of the largest element is " + myLocation.maxValue +
                " at (" + myLocation.row + ", " + myLocation.column + ").");

        sc.close();
    }
}

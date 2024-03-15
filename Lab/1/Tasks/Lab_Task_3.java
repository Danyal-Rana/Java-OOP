import java.util.*;

class Car
{
    private String name;
    private String parentCompany;
    private int modelNo;
    private int maxSpeed;
    private int noOfSeats;

    void settigData (String name, String parentCompany, int modelNo, int maxSpeed, int noOfSeats)
    {
        this.name = name;
        this.parentCompany = parentCompany;
        this. modelNo = modelNo;
        this.maxSpeed = maxSpeed;
        this.noOfSeats = noOfSeats;
    }

    void display ()
    {
        System.out.println ("Car name: " +name+ ". Parent company is: " +parentCompany+ ". Model number is: " +modelNo+ ". Maximum Speed is: " +maxSpeed+ ". No. of Seats: " +noOfSeats+ ".");
    }
}

public class Lab_Task_3
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print ("Enter the name of car: ");
        String name = sc.next();
        System.out.print ("Enter the Parent company name: ");
        String parentCompany = sc.next();
        System.out.print ("Enter the model: ");
        int modelNo = sc.nextInt();
        System.out.print ("Enter the maximum Speed: ");
        int maxSpeed = sc.nextInt();
        System.out.print ("Enter the total number of Seats: ");
        int noOfSeats = sc.nextInt();

        Car c1 = new Car();

        c1.settigData(name, parentCompany, modelNo, maxSpeed, noOfSeats);

        c1.display();

        sc.close();
    }
}
import java.util.*;

class CarPart
{
    private String modelNumber;
    private String partNumber;
    private String cost;
    
    public void setParameter (String x, String y, String z)
    {
        modelNumber = x;
        partNumber = y;
        cost = z;
    }
    
    public void display ()
    {
        System.out.println ("Model Number: " + modelNumber + ". Part Number: " + partNumber + ". Cost: " + cost);
    }
}

public class Activity_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        CarPart car1 = new CarPart();
        System.out.print ("Enter the Model Number: ");
        String x = sc.nextLine();
        System.out.print ("Enter the Part Number: ");
        String y = sc.nextLine();
        System.out.print ("Enter the cost: ");
        String z = sc.nextLine();
        
        car1.setParameter (x , y, z);
        car1.display();
        sc.close();
    }
    
}

interface Payable
{
    double getPaymentAmount();
}

class Invoice implements Payable
{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice () {}
    
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem)
    {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public void setPartNumber (String partNumber)
    {
        this.partNumber = partNumber;
    }

    public void setPartDescription (String partDescription)
    {
        this.partDescription = partDescription;
    }

    public void setQuantity (int quantity)
    {
        this.quantity = quantity;
    }

    public void setPricePerItem (double pricePerItem)
    {
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber ()
    {
        return this.partNumber;
    }

    public String getPartDescription ()
    {
        return this.partDescription;
    }

    public int getQuantity ()
    {
        return this.quantity;
    }

    public double getPricePerItem ()
    {
        return this.pricePerItem;
    }

    @Override
    public double getPaymentAmount()
    {
        return this.pricePerItem*this.quantity;
    }

}

abstract class Employee implements Payable
{
    protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;

    public Employee () {}

    public Employee (String firstName, String lastName, String socialSecurityNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setFirstName (String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }

    public void setSocialSecurityNumber (String socialSecurityNumber)
    {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName ()
    {
        return this.firstName;
    }

    public String getLastName ()
    {
        return this.lastName;
    }

    public String getSocialSecurityNumber ()
    {
        return this.socialSecurityNumber;
    }
}

class SalariedEmployee extends Employee
{
    private double weeklySalary;

    public SalariedEmployee () {}
    
    public SalariedEmployee (String firstName, String lastName, String socialSecurityNumber, double weeklySalary)
    {
        super (firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public void setWeeklySalary (double weeklySalary)
    {
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary ()
    {
        return this.weeklySalary;
    }

    @Override
    public double getPaymentAmount()
    {
        return this.weeklySalary*4;
    }
}

public class Task_2
{
    public static void main(String[] args)
    {
        Invoice myInvoice = new Invoice("Dummy", "Description", 12, 23.45);

        SalariedEmployee s1 = new SalariedEmployee("Danyal", "Rana", "505", 500);

        System.out.println(myInvoice.getPaymentAmount());

        System.out.println(s1.getPaymentAmount());
    }
}
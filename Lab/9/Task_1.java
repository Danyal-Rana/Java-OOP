class Package
{
    protected String senderName;
    protected String senderAddress;
    protected String recipientName;
    protected String recipientAddress;
    protected double weight;
    protected double costPerOunce;

    public Package () {}

    public Package (String sName, String sAdd, String rName, String rAdd, double weight, double costPerOunce)
    {
        this.senderName = sName;
        this.senderAddress = sAdd;
        this.recipientName = rName;
        this.recipientAddress = rAdd;

        if (weight>0 && costPerOunce>0)
        {
            this.weight = weight;
            this.costPerOunce = costPerOunce;
        }
        else
        {
            System.out.println("Invalid weight or costPerOunce, setting it zero.");
        }
    }

    public double calculateCost ()
    {
        return this.weight * this.costPerOunce;
    }
}

class TwoDayPackage extends Package
{
    private double flatFee;

    public TwoDayPackage () {}

    public TwoDayPackage (String sName, String sAdd, String rName, String rAdd, double weight, double costPerOunce, double flatFee)
    {
        super (sName, sAdd, rName, rAdd, weight, costPerOunce);
        this.flatFee = flatFee;
    }

    @Override
    public double calculateCost()
    {
        return this.flatFee + super.calculateCost();
    }
}

class OverNightPackage extends Package
{
    private double additionalFee;

    public OverNightPackage () {}

    public OverNightPackage (String sName, String sAdd, String rName, String rAdd, double weight, double costPerOunce, double additionalFee)
    {
        super (sName, sAdd, rName, rAdd, weight, costPerOunce);
        this.additionalFee = additionalFee;
    }

    @Override
    public double calculateCost()
    {
        return this.additionalFee + super.calculateCost();
    }
}


public class Task_1
{
    public static void main (String[] args)
    {
        Package pack1 = new Package ("Danyal", "Ghouri Garde,", "Huzaifa", "Hostel City", 5, 50);
        System.out.println (pack1.calculateCost());

        package pack2 = new TwoDayPackage ("Danyal", "Ghouri Garde,", "Huzaifa", "Hostel City", 5, 50, 100);
        System.out.println (pack2.calculateCost());

        OverNightPackage pack3 = new OverNightPackage ("Danyal", "Ghouri Garde,", "Huzaifa", "Hostel City", 5, 50, 1000);
        System.out.println (pack3.calculateCost());
    }
}
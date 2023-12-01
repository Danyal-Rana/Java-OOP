class Car
{
    public void start ()
    {
        System.out.println("Car has been started");
    }

    public void accelerate ()
    {
        System.out.println("Car has been accelerated.");
    }

    public void changeGear ()
    {
        System.out.println("Gear of the Car has been changed.");
    }
}

class LuxuryCar extends Car
{
    public void start ()
    {
        System.out.println("Luxury Car has been started.");
    }

    public void accelerate ()
    {
        System.out.println("Luxury Car has been accelerated.");
    }

    public void changeGear ()
    {
        System.out.println("Gear of the Luxury Car has been changed.");
    }

    public void openRoof ()
    {
        System.out.println("Roof is opened.");
    }
}

public class Program_6
{
    public static void main(String[] args)
    {
        Car c1 = new Car();
        c1.start();
        c1.accelerate();
        c1.changeGear();

        System.out.println ();

        LuxuryCar c2 = new LuxuryCar ();
        c2.start();
        c2.accelerate();
        c2.changeGear();
        c2.openRoof();

        System.out.println ();

        Car c3 = new LuxuryCar();
        c3.start();
        c3.accelerate();
        c3.changeGear();
        // c3.openRoof(); NOT ALLOWED TO ACCESS (ONLY MUTUAL/COMMON MEHTODS CAN BE CALLED and METHODS OF THE OBJECT ARE BEING CALLED, NOT THE METHODS OF REFERENCE)

        System.out.println();

        // LuxuryCar c4 = new Car(); NOT ALLOWED TO CREATE OBJECT OF PARENT CLASS FROM THE REFERENCE OF CHILD CLASS
    }
}
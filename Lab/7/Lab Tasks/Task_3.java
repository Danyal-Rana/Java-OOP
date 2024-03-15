import java.util.Scanner;

class Computer
{
    private int wordSize;
    private int memorySize;
    private int storageSize;
    private int speed;

    public Computer () {}

    public Computer(int wordSize, int memorySize, int storageSize, int speed)
    {
        this.wordSize = wordSize;
        this.memorySize = memorySize;
        this.storageSize = storageSize;
        this.speed = speed;
    }

    public int getWordSize()
    {
        return wordSize;
    }

    public void setWordSize(int wordSize)
    {
        this.wordSize = wordSize;
    }

    public int getMemorySize()
    {
        return memorySize;
    }

    public void setMemorySize(int memorySize)
    {
        this.memorySize = memorySize;
    }

    public int getStorageSize()
    {
        return storageSize;
    }

    public void setStorageSize(int storageSize)
    {
        this.storageSize = storageSize;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public void display()
    {
        System.out.println("Word Size: " + wordSize + " bits.");
        System.out.println("Memory Size: " + memorySize + " MegaBytes.");
        System.out.println("Storage Size: " + storageSize + " MegaBytes.");
        System.out.println("Speed: " + speed + " MegaHertz.");
    }
}

class Laptop extends Computer
{
    private int length;
    private int width;
    private int height;
    private int weight;

    public Laptop () {}

    public Laptop(int wordSize, int memorySize, int storageSize, int speed, int length, int width, int height, int weight) {
        super(wordSize, memorySize, storageSize, speed);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public int getLength()
    {
        return length;
    }

    public void setLength (int length)
    {
        this.length = length;
    }

    public int getWidth ()
    {
        return width;
    }

    public void setWidth (int width)
    {
        this.width = width;
    }

    public int getHeight ()
    {
        return height;
    }

    public void setHeight (int height)
    {
        this.height = height;
    }

    public int getWeight ()
    {
        return weight;
    }

    public void setWeight (int weight)
    {
        this.weight = weight;
    }

    @Override
    public void display ()
    {
        super.display();
        System.out.println("Length: " + length + " inches.");
        System.out.println("Width: " + width + " inches.");
        System.out.println("Height: " + height + " inches.");
        System.out.println("Weight: " + weight + " pounds.");
    }
}

public class Task_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Laptop laptop = new Laptop();

        System.out.print ("Enter Word Size (in bits): ");
        int wordSize = sc.nextInt();
        laptop.setWordSize (wordSize);

        System.out.print ("Enter Memory Size (in megabytes): ");
        int memorySize = sc.nextInt();
        laptop.setMemorySize(memorySize);

        System.out.print ("Enter Storage Size (in megabytes): ");
        int storageSize = sc.nextInt();
        laptop.setStorageSize(storageSize);

        System.out.print ("Enter Speed (in megahertz): ");
        int speed = sc.nextInt();
        laptop.setSpeed(speed);

        System.out.print ("Enter Length (in inches): ");
        int length = sc.nextInt();
        laptop.setLength(length);

        System.out.print ("Enter Width (in inches): ");
        int width = sc.nextInt();
        laptop.setWidth(width);

        System.out.print ("Enter Height (in inches): ");
        int height = sc.nextInt();
        laptop.setHeight(height);

        System.out.print ("Enter Weight (in pounds): ");
        int weight = sc.nextInt();
        laptop.setWeight(weight);

        System.out.println ("\nLaptop Details: ");
        laptop.display();

        sc.close();
    }
}

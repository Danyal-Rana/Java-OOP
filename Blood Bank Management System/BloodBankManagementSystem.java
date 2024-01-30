import java.io.*;
import java.util.*;

class BloodDonor
{
    private String name;
    private String bloodGroup;
    private int age;
    private boolean hepatitisPositive;

    public BloodDonor(String name, String bloodGroup, int age, boolean hepatitisPositive)
    {
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.age = age;
        this.hepatitisPositive = hepatitisPositive;
    }

    public String getName()
    {
        return name;
    }

    public String getBloodGroup()
    {
        return bloodGroup;
    }

    public int getAge()
    {
        return age;
    }

    public boolean isHepatitisPositive()
    {
        return hepatitisPositive;
    }

    @Override
    public String toString()
    {
        return "Name: " + name + ", Blood Group: " + bloodGroup + ", Age: " + age + ", Hepatitis Positive: " + hepatitisPositive;
    }
}

class BloodReceiver
{
    private String name;
    private String bloodGroup;
    private int age;

    public BloodReceiver(String name, String bloodGroup, int age)
    {
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public String getBloodGroup()
    {
        return bloodGroup;
    }

    public int getAge()
    {
        return age;
    }

    @Override
    public String toString()
    {
        return "Name: " + name + ", Blood Group: " + bloodGroup + ", Age: " + age;
    }
}

class BloodBank
{
    private List<BloodDonor> donors;
    private List<BloodReceiver> receivers;
    private String donorsFile;
    private String receiversFile;

    public BloodBank(String donorsFile, String receiversFile)
    {
        this.donorsFile = donorsFile;
        this.receiversFile = receiversFile;
        donors = new ArrayList<>();
        receivers = new ArrayList<>();
    }

    public void addDonor(BloodDonor donor)
    {
        donors.add(donor);
    }

    public void addReceiver(BloodReceiver receiver)
    {
        receivers.add(receiver);
    }

    public void saveDonorsToFile()
    {
        try (PrintWriter writer = new PrintWriter(new FileWriter(donorsFile)))
        {
            for (BloodDonor donor : donors)
            {
                writer.println(donor.getName() + "," + donor.getBloodGroup() + "," + donor.getAge() + "," + donor.isHepatitisPositive());
            }
            System.out.println("Donors saved to file successfully.");
        }
        catch (IOException e)
        {
            System.out.println("Error saving donors to file: " + e.getMessage());
        }
    }

    public void saveReceiversToFile()
    {
        try (PrintWriter writer = new PrintWriter(new FileWriter(receiversFile)))
        {
            for (BloodReceiver receiver : receivers)
            {
                writer.println(receiver.getName() + "," + receiver.getBloodGroup() + "," + receiver.getAge());
            }
            System.out.println("Receivers saved to file successfully.");
        }
        catch (IOException e)
        {
            System.out.println("Error saving receivers to file: " + e.getMessage());
        }
    }

    public void loadDonorsFromFile()
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(donorsFile)))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                String[] donorData = line.split(",");
                if (donorData.length == 4)
                {
                    String name = donorData[0];
                    String bloodGroup = donorData[1];
                    int age = Integer.parseInt(donorData[2]);
                    boolean hepatitisPositive = Boolean.parseBoolean(donorData[3]);
                    BloodDonor donor = new BloodDonor(name, bloodGroup, age, hepatitisPositive);
                    donors.add(donor);
                }
            }
            System.out.println("Donors loaded from file successfully.");
        }
        catch (IOException e)
        {
            System.out.println("Error loading donors from file: " + e.getMessage());
        }
    }

    public void loadReceiversFromFile()
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(receiversFile)))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                String[] receiverData = line.split(",");
                if (receiverData.length == 3)
                {
                    String name = receiverData[0];
                    String bloodGroup = receiverData[1];
                    int age = Integer.parseInt(receiverData[2]);
                    BloodReceiver receiver = new BloodReceiver(name, bloodGroup, age);
                    receivers.add(receiver);
                }
            }
            System.out.println("Receivers loaded from file successfully.");
        }
        catch (IOException e)
        {
            System.out.println("Error loading receivers from file: " + e.getMessage());
        }
    }

    public void printDonors()
    {
        if (donors.isEmpty())
        {
            System.out.println("No donors available.");
            return;
        }

        System.out.println("Blood Donors:");
        for (BloodDonor donor : donors)
        {
            System.out.println(donor);
        }
    }

    public void printReceivers()
    {
        if (receivers.isEmpty())
        {
            System.out.println("No receivers available.");
            return;
        }

        System.out.println("Blood Receivers:");
        for (BloodReceiver receiver : receivers)
        {
            System.out.println(receiver);
        }
    }
}

public class BloodBankManagementSystem
{
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        BloodBank bloodBank = new BloodBank("donors.txt", "receivers.txt");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Blood Bank Management System");
        System.out.println("1. Donor");
        System.out.println("2. Receiver");
        System.out.print("Enter your choice (1/2): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character

        if (choice == 1)
        {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline character
            System.out.print("Enter your blood group: ");
            String bloodGroup = scanner.nextLine();
            System.out.print("Are you hepatitis positive? (true/false): ");
            boolean hepatitisPositive = scanner.nextBoolean();

            BloodDonor donor = new BloodDonor(name, bloodGroup, age, hepatitisPositive);
            if (!donor.isHepatitisPositive())
            {
                bloodBank.addDonor(donor);
                bloodBank.saveDonorsToFile();
                System.out.println("Thank you for your blood donation!");
            }
            else
            {
                System.out.println("Sorry, hepatitis positive donors are not eligible to donate blood.");
            }
        }
        else if (choice == 2)
        {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline character
            System.out.print("Enter your required blood group: ");
            String bloodGroup = scanner.nextLine();

            BloodReceiver receiver = new BloodReceiver(name, bloodGroup, age);
            bloodBank.addReceiver(receiver);
            bloodBank.saveReceiversToFile();
            System.out.println("Thank you for registering as a blood receiver!");
        }
        else
        {
            System.out.println("Invalid choice!");
        }

        scanner.close();

        bloodBank.loadDonorsFromFile();
        bloodBank.loadReceiversFromFile();

        System.out.println("\nBlood Donors:");
        bloodBank.printDonors();

        System.out.println("\nBlood Receivers:");
        bloodBank.printReceivers();
    }
}
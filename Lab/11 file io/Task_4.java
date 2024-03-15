import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Account implements Serializable 
{
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) 
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() 
    {
        return accountNumber;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void deposit(double amount) 
    {
        balance += amount;
    }

    public boolean withdraw(double amount) 
    {
        if (amount <= balance) 
        {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean transfer(Account receiver, double amount) 
    {
        if (withdraw(amount)) 
        {
            receiver.deposit(amount);
            return true;
        }
        return false;
    }
}

public class Task_4 
{
    private static final String FILENAME = "Accounts.ser";

    public static void main(String[] args) 
    {
        ArrayList<Account> accounts = readFromFile();

        if (accounts.isEmpty()) 
        {
            createSampleAccounts(accounts);
        }

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) 
        {
            System.out.println("Choose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Balance Inquiry");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            switch (choice) 
            {
                case 1:
                    deposit(accounts);
                    break;
                case 2:
                    withdraw(accounts);
                    break;
                case 3:
                    transfer(accounts);
                    break;
                case 4:
                    balanceInquiry(accounts);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }

        writeToFile(accounts);
        scanner.close();
    }

    private static void createSampleAccounts(ArrayList<Account> accounts) 
    {
        for (int i = 1; i <= 10; i++) {
            accounts.add(new Account(i, 1000.0));
        }
    }

    private static ArrayList<Account> readFromFile() 
    {
        ArrayList<Account> accounts = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILENAME))) 
        {
            while (true) 
            {
                try 
                {
                    Account account = (Account) objectInputStream.readObject();
                    accounts.add(account);
                } 
                catch (EOFException e) 
                {
                    break;
                }
            }
        } 
        catch (IOException | ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        return accounts;
    }

    private static void writeToFile(ArrayList<Account> accounts) 
    {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILENAME))) 
        {
            for (Account account : accounts) 
            {
                objectOutputStream.writeObject(account);
            }
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
    }

    private static Account getAccountByNumber(ArrayList<Account> accounts, int accountNumber) 
    {
        for (Account account : accounts) 
        {
            if (account.getAccountNumber() == accountNumber) 
            {
                return account;
            }
        }
        return null;
    }

    private static void deposit(ArrayList<Account> accounts) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number:");
        int accountNumber = scanner.nextInt();

        Account account = getAccountByNumber(accounts, accountNumber);
        if (account != null) 
        {
            System.out.println("Enter deposit amount:");
            double amount = scanner.nextDouble();
            account.deposit(amount);
            System.out.println("Deposit successful.");
        } 
        else 
        {
            System.out.println("Account not found.");
        }
        scanner.close();
    }

    private static void withdraw(ArrayList<Account> accounts) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number:");
        int accountNumber = scanner.nextInt();

        Account account = getAccountByNumber(accounts, accountNumber);
        if (account != null) 
        {
            System.out.println("Enter withdrawal amount:");
            double amount = scanner.nextDouble();
            if (account.withdraw(amount)) 
            {
                System.out.println("Withdrawal successful.");
            } 
            else 
            {
                System.out.println("Insufficient balance.");
            }
        } 
        else 
        {
            System.out.println("Account not found.");
        }

        scanner.close();
    }

    private static void transfer(ArrayList<Account> accounts) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sender account number:");
        int senderAccountNumber = scanner.nextInt();

        System.out.println("Enter receiver account number:");
        int receiverAccountNumber = scanner.nextInt();

        Account sender = getAccountByNumber(accounts, senderAccountNumber);
        Account receiver = getAccountByNumber(accounts, receiverAccountNumber);

        if (sender != null && receiver != null) 
        {
            System.out.println("Enter transfer amount:");
            double amount = scanner.nextDouble();
            if (sender.transfer(receiver, amount)) 
            {
                System.out.println("Transfer successful.");
            } 
            else 
            {
                System.out.println("Transfer failed: Insufficient balance.");
            }
        } 
        else 
        {
            System.out.println("One or both accounts not found.");
        }

        scanner.close();
    }

    private static void balanceInquiry(ArrayList<Account> accounts) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number:");
        int accountNumber = scanner.nextInt();

        Account account = getAccountByNumber(accounts, accountNumber);
        if (account != null) 
        {
            System.out.println("Balance: " + account.getBalance());
        } 
        else 
        {
            System.out.println("Account not found.");
        }

        scanner.close();
    }
}
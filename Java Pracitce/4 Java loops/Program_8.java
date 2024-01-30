/*
Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
 */

import java.util.Scanner;

public class Program_8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print ("Enter the first number: ");
        int num_1 = sc.nextInt();

        System.out.print ("Enter the second number: ");
        int num_2 = sc.nextInt();

        int ans = 1;

        for (int i=1; i<=num_2; i++)
        {
            ans = ans*num_1;
        }

        System.out.println ("The result of "+num_1+" raised to power "+num_2+" is: "+ans+".");
        
        sc.close();
    }
}
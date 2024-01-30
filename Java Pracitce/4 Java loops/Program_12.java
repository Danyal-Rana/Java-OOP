/*
Write a program to calculate HCF of Two given number.
 */

import java.util.Scanner;

public class Program_12
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print ("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print ("Enter the second number: ");
        int num2 = sc.nextInt();

        int HCF =0;

        for (int i=2; i<=num1; i++)
        {
            if (num1%i==0)
            {
                if (num2%i==0)
                {
                    HCF = i;
                }
            }
        }

        if (HCF>1)
        {
            System.out.println ("The HCF of the entered numbers is: "+ HCF);
        }
        else
        {
            System.out.println ("Entered numbers don't have a HCF");
        }

        

        sc.close();
    }
}
/*
Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.
 */

import java.util.Scanner;

public class Program_11
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);

        System.out.print ("Enter a postive integar: ");
        int x = inp.nextInt();

        boolean primeNum = true;

        if (x>0)
        {
            for (int i=2; i<x; i++)
            {
                if (x%i==0)
                {
                    primeNum = false;
                    break;
                }
                else
                {
                    primeNum = true;
                }
            }

            if (primeNum==true)
            {
                System.out.println ("The entered number is a Prime Number.");
            }
            else
            {
                System.out.println ("The entered number is NOT a Prime number.");
            }
        }
        else
        {
            System.out.println ("You entered the wrong number.");
        }
        inp.close();
    }
}
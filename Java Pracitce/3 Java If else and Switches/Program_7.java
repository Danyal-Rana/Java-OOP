import java.util.*;

public class Program_7
{
    public static void main (String[] args)
    {
        Random rand = new Random();

        int comp = rand.nextInt(3-0);

        String compName = "a";

        if (comp==0)
        {
            compName = "Scissor";
        }
        else if (comp == 1)
        {
            compName = "Rock";
        }
        else if (comp == 2)
        {
            compName = "Paper";
        }

        System.out.print ("Enter a number (0 for Scissor, 1 for Rock, 2 for Paper): ");

        Scanner sc = new Scanner(System.in);

        int user = sc.nextInt();

        String userName = "a";

        if (user==0)
        {
            userName = "Scissor";
        }
        else if (user == 1)
        {
            userName = "Rock";
        }
        else if (user == 2)
        {
            userName = "Paper";
        }

        if (user>=0 && user<=2)
        {
            if (user==0 && comp==2)
            {
                System.out.println ("You won! \nThe Computer is " +compName+ ". You are " +userName);
            }
            else if (user==1 && comp==0)
            {
                System.out.println ("You won! \nThe Computer is " +compName+ ". You are " +userName);
            }
            else if (user==2 && comp==1)
            {
                System.out.println ("You won! \nThe Computer is " +compName+ ". You are " +userName);
            }
            else if (user == comp)
            {
                System.out.println ("Draw, as both inputs are same (i:e " +userName+")");
            }
            else
            {
                System.out.println ("Computer Wins! as you enter " +userName+ " and computer enters " + compName);
            }
        }
        else
        {
            System.out.println ("You entered the Wrong Input.");
        }

        sc.close();
    }
}
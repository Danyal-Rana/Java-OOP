public class Program_14
{
    public static void main (String[] args)
    {
        float tutionFee = 10000;

        float totalFee = 0;

        int i=1;

        while (i<=14)
        {
            float percentInc = 0.06f * tutionFee;
            tutionFee = tutionFee + percentInc;

            if (i>=11)
            {
                totalFee = totalFee + tutionFee;
            }

            i++;
        }

        System.out.println ("The total fee after ten years will be: " +totalFee);
    }
}
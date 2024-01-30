public class Program_8
{
    public static void main (String[] args)
    {

        double births = 31536000.0/7.0;

        double immigrants = 31536000/45.0;

        double deaths = 3153600/13.0;

        double population = (births+immigrants) - deaths;

        int perYearPopulation = (int) population;

        int currentPopulation = 312032486;

        System.out.println ("Population of the first year will be: " +currentPopulation+(perYearPopulation));

        System.out.println ("Population of the second year will be: " +currentPopulation+(perYearPopulation*2));

        System.out.println ("Population of the third year will be: " +currentPopulation+(perYearPopulation*3));

        System.out.println ("Population of the fourth year will be: " +currentPopulation+(perYearPopulation*4));

        System.out.println ("Population of the fifth year will be: " +currentPopulation+(perYearPopulation*5));
    }
}
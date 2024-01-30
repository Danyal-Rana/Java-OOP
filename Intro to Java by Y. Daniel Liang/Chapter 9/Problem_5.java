import java.util.*;

public class Problem_5
{
    public static void main(String[] args)
    {
        GregorianCalendar myCal = new GregorianCalendar();

        System.out.println
        (
            myCal.get(GregorianCalendar.YEAR) + " : " +
            myCal.get(GregorianCalendar.MONTH) + " : " +
            myCal.get(GregorianCalendar.DAY_OF_MONTH)
        );

        myCal.setTimeInMillis(1234567898765L);

        System.out.println
        (
            myCal.get(GregorianCalendar.YEAR) + " : " +
            myCal.get(GregorianCalendar.MONTH) + " : " +
            myCal.get(GregorianCalendar.DAY_OF_MONTH)
        );
    }
}
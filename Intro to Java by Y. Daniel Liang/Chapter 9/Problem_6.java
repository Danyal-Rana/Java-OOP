public class Problem_6
{
    public static void main (String[] args)
    {
        StopWatch myStopWatch = new StopWatch();

        myStopWatch.start();

        for (int i=0; i<100000; i++)
        {}

        myStopWatch.stop();

        System.out.println ("Elapsed time is: " +myStopWatch.getElapsedTime()+ " milliseconds.");
    }
}

class StopWatch
{
    private long startTime;
    private long endTime;
    
    StopWatch ()
    {
        this.startTime = System.currentTimeMillis();
    }

    void start ()
    {
        this.startTime = System.currentTimeMillis();
    }

    void stop ()
    {
        this.endTime = System.currentTimeMillis();
    }

    long getElapsedTime ()
    {
        return this.endTime - this.startTime;
    }

    long getStartTime ()
    {
        return this.startTime;
    }

    long getEndTime ()
    {
        return this.endTime;
    }
}
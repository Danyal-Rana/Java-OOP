import java.sql.SQLOutput;

abstract class Movie
{
    protected String MPAARating;
    protected int idNum;
    protected String movieTitle;

    public Movie () {}

    public Movie (String MPAARating, int idNum, String movieTitle)
    {
        this.MPAARating = MPAARating;
        this.idNum = idNum;
        this.movieTitle = movieTitle;
    }

    public void setRating (String MPAARating)
    {
        this.MPAARating = MPAARating;
    }

    public void setIdNum (int idNum)
    {
        this.idNum = idNum;
    }

    public void setMovieTitle (String movieTitle)
    {
        this.movieTitle =movieTitle;
    }

    public String getRating ()
    {
        return this.MPAARating;
    }

    public int getIdNum ()
    {
        return this.idNum;
    }

    public String getMovieTitle ()
    {
        return this.movieTitle;
    }

    public boolean equals (Movie m)
    {
        return this.idNum == m.getIdNum();
    }

    public abstract double calcLateFee (int daysLate);
}

class Action extends Movie
{
    public Action (String MPAARating, int idNum, String movieTitle)
    {
        super (MPAARating, idNum, movieTitle);
    }

    public double calcLateFee (int daysLate)
    {
        return 3*daysLate;
    }
}

class Comedy extends Movie
{
    public Comedy (String MPAARating, int idNum, String movieTitle)
    {
        super (MPAARating, idNum, movieTitle);
    }

    public double calcLateFee (int daysLate)
    {
        return 2.5*daysLate;
    }
}

class Drama extends Movie
{
    public Drama (String MPAARating, int idNum, String movieTitle)
    {
        super (MPAARating, idNum, movieTitle);
    }

    public double calcLateFee (int daysLate)
    {
        return 2*daysLate;
    }
}

public class Task_1
{
    public static void main (String[] args)
    {
        Movie m1 = new Action ("R", 101, "Movie 1");
        Movie m2 = new Comedy ("PG-13", 102, "Movie 2");
        Movie m3 = new Drama ("G", 103, "Movie 3");

        System.out.println ("Is movie1 equals to movie2: " + m1.equals(m2));

        int x = 5;

        System.out.println ("Late fee for movie1 is: " + m1.calcLateFee(x));
        System.out.println ("Late fee for movie2 is: " + m2.calcLateFee(x));
        System.out.println ("Late fee for movie3 is: " + m3.calcLateFee(x));
    }
}

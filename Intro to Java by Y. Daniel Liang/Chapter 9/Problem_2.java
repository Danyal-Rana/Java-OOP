class Stock
{
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock (String symbol, String name)
    {
        this.symbol = symbol;
        this.name = name;
    }

    double getChangePercent ()
    {
        return ((this.currentPrice - this.previousClosingPrice)/this.previousClosingPrice)*100;
    }

    void setPreviousClosingPrice (double previousClosingPrice)
    {
        this.previousClosingPrice = previousClosingPrice;
    }

    void setCurrentPrice (double currentPrice)
    {
        this.currentPrice = currentPrice;
    }
}

public class Problem_2
{
    public static void main (String[] args)
    {
        Stock stock = new Stock("ORCL", "Oracle Corporation");

        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);

        System.out.println ("Price-change percentage is: " + stock.getChangePercent());
    }
}
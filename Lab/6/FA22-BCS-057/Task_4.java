class Pizza
{
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    public Pizza () {}

    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings)
    {
        if (isValidSize(size))
        {
            this.size = size;
        }
        else
        {
            this.size = "small";
        }
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }

    private boolean isValidSize(String size)
    {
        return size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large");
    }


    public void setSize (String size)
    {
        if (size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large"))
        {
            this.size = size;
        }
        else
        {
            this.size = "small";
        }
    }

    public void setCheeseToppings (int cheeseToppings)
    {
        this.cheeseToppings = cheeseToppings;
    }

    public void setPepperoniToppings (int pepperoniToppings)
    {
        this.pepperoniToppings = pepperoniToppings;
    }

    public void setHamToppings (int hamToppings)
    {
        this.hamToppings = hamToppings;
    }

    public String getSize ()
    {
        return this.size;
    }

    public int getCheeseToppings ()
    {
        return this.cheeseToppings;
    }

    public int getPepperoniToppings ()
    {
        return this.pepperoniToppings;
    }

    public int getHamToppings ()
    {
        return this.hamToppings;
    }

    public int calcCost ()
    {
        int toppings = this.cheeseToppings + this.pepperoniToppings + this.hamToppings;

        if (this.size.equalsIgnoreCase("large"))
        {
            return 14+(2*toppings);
        }
        else if (this.size.equalsIgnoreCase("medium"))
        {
            return 12+(2*toppings);
        }
        else
        {
            return 10+(2*toppings);
        }
    }

    public String getDescription ()
    {
        return "Size is " +this.getSize()+ ", Cheese toppings are " +this.getCheeseToppings()+ ", Pepperoni toppings are " +this.getPepperoniToppings()+ " and Ham toppings are " +this.getHamToppings()+ ".";
    }


}

class PizzaOrder
{
    private Pizza[] pizzas = new Pizza[3];

    public PizzaOrder () {}

    public PizzaOrder (Pizza p1)
    {
        pizzas[0] = p1;
    }

    public PizzaOrder (Pizza p1, Pizza p2)
    {
        pizzas[0] = p1;
        pizzas[1] = p2;
    }

    public PizzaOrder (Pizza p1, Pizza p2, Pizza p3)
    {
        pizzas[0] = p1;
        pizzas[1] = p2;
        pizzas[2] = p3;
    }

    public int calcTotal ()
    {
        int totalCost = 0;

        for (Pizza p : pizzas)
        { 
            if(p==null)
            {
                break;
            }
            totalCost += p.calcCost();
        }

        return totalCost;
    }
}

public class Task_4
{
    public static void main (String[] args)
    {
        System.out.println ();
        Pizza p = new Pizza("large", 1, 1, 2);
        System.out.println (p.getDescription());
        System.out.println ("Cost is: $" + p.calcCost());

        System.out.println ();

        Pizza p1 = new Pizza("medium", 2, 2, 2);
        Pizza p2 = new Pizza("small", 1, 1, 3);

        PizzaOrder order1 = new PizzaOrder(p1, p2);
        System.out.println ("Total cost of ordered Pizzas are $" + order1.calcTotal());

    }
}
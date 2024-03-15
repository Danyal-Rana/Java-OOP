class HotDogStand
{
    private int IDnum;
    private int soldNum = 0;

    public HotDogStand ()
    {
        this.IDnum = 1;
        this.soldNum = 0;
    }

    public HotDogStand (int IDnum, int soldNum)
    {
        this.IDnum = IDnum;
        this.soldNum = soldNum;
    }

    public void setIDnum (int IDnum)
    {
        this.IDnum = IDnum;
    }

    public void setSoldNum (int soldNum)
    {
        this.soldNum = soldNum;
    }

    public int getIDNum ()
    {
        return this.IDnum;
    }

    public int getSoldNum ()
    {
        return this.soldNum;
    }

    public void justSold ()
    {
        this.soldNum++;
    }
}

public class Lab_Task_4
{
    public static void main (String[] args)
    {
        HotDogStand Dog_1 = new HotDogStand (111, 10);
        HotDogStand Dog_2 = new HotDogStand (222, 0);
        HotDogStand Dog_3 = new HotDogStand (333, 17);

        Dog_1.justSold();
        Dog_1.justSold();
        Dog_1.justSold();

        Dog_2.justSold();
        Dog_2.justSold();
        Dog_2.justSold();
        Dog_2.justSold();
        Dog_2.justSold();
        Dog_2.justSold();
        Dog_2.justSold();
        Dog_2.justSold();

        Dog_3.justSold();
        Dog_3.justSold();

        System.out.println ();
        System.out.println ("ID             Sold");
        System.out.println ("-------------------");
        System.out.println ();

        System.out.println (Dog_1.getIDNum() +"             "+ Dog_1.getSoldNum());
        System.out.println (Dog_2.getIDNum() +"             "+ Dog_2.getSoldNum());
        System.out.println (Dog_3.getIDNum() +"             "+ Dog_3.getSoldNum());

        System.out.println ();        
        System.out.println ("Total number of Dogs sold is: " + (Dog_1.getSoldNum()+Dog_2.getSoldNum()+Dog_3.getSoldNum()));



    }
}
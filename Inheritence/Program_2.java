class CellPhone
{
    int phoneNUm;
    int IMEI;

    public void call ()
    {
        System.out.println ("Calling ... ");
    }

    public void sms ()
    {
        System.out.println ("Sending sms ...");
    }

    public void savingContact ()
    {
        System.out.println ("Contact has been saved.");
    }

    public void deletingContact ()
    {
        System.out.println ("Contact has been deleted.");
    }
}

class SmartPhone extends CellPhone
{
    String macNum;

    public void playMusic ()
    {
        System.out.println ("Playing the music ...");
    }

    public void takePictures ()
    {
        System.out.println ("Taking the picture ...");
    }
}

public class Program_2
{
    public static void main (String[] args)
    {
        SmartPhone myObj = new SmartPhone();

        myObj.phoneNUm = 5;
        myObj.IMEI = 242505;
        myObj.macNum = "26-95-212";

        myObj.call();
        myObj.sms();
        myObj.savingContact();
        myObj.deletingContact();
        myObj.playMusic();
        myObj.takePictures();
    }
}

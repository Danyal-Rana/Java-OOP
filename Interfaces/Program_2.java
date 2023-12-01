interface ICamera
{
    void click ();
    void record ();
}

interface  IMusicPlayer
{
    void play ();
    void stop ();
}

class Phone
{
    void call ()
    {
        System.out.println("Calling via Phone class");
    }
    void sms ()
    {
        System.out.println("Sending SMS via Phone class");
    }
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer
{
    public void call ()
    {
        System.out.println("Calling via SmartPhone class.");
    }
    public void sms ()
    {
        System.out.println("Sending SMS via SmartPhone class.");
    }
    public void click ()
    {
        System.out.println("Clicking the Photo.");
    }
    public void record ()
    {
        System.out.println("Recording the Video.");
    }
    public void play ()
    {
        System.out.println("Playing the Music.");
    }
    public void stop ()
    {
        System.out.println("Stoping the Music");
    }
    public void fingerPrint ()
    {
        System.out.println("Using Biometeric.");
    }
}

public class Program_2
{
    public static void main (String[] args)
    {
        System.out.println("Using the SmartPhone class as Reference.");
        SmartPhone sp = new SmartPhone();
        sp.call();
        sp.sms();
        sp.click();
        sp.record();
        sp.play();
        sp.stop();
        sp.fingerPrint();

        System.out.println("\nUsing the Phone class as Reference");
        Phone p = sp;
        p.call();
        p.sms();

        System.out.println("\nUsing the ICamnera interface as reference.");
        ICamera c = sp;
        c.click();
        c.record();

        System.out.println("\nUsing the IMusicPlayer interference as reference.");
        IMusicPlayer m = sp;
        m.play();
        m.stop();
    }
}

import mypack.Demo;
import mypack.Demo2;
import mypack.innerpack.Demo3;

public class DemoMain
{
    public static void main(String[] args)
    {
        Demo d = new Demo();
        d.display();

        Demo2 d2 = new Demo2();
        d2.display();

        Demo3 d3 = new Demo3();
        d3.display();
    }
}
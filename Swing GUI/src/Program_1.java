// creating our first window
package src;

import javax.swing.*;

public class Program_1
{
    public Program_1 ()
    {
        JFrame jFrame = new JFrame();

        jFrame.setTitle("Normal Title");
        jFrame.setLayout(null);
        jFrame.setSize(1000, 1000);
        jFrame.setVisible(true);
    }

    public static void main(String[] args)
    {
        Program_1 obj = new Program_1();
    }
}

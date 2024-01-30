import java.util.ArrayList;
import java.util.Collections;

public class Array_list
{
    public static void main (String[] args)
    {
        ArrayList <Integer> myArrayList = new ArrayList<Integer>();

        // adding elements
        myArrayList.add(0);
        myArrayList.add(10);
        myArrayList.add(20);
        System.out.println (myArrayList);

        // getting specific element
        int myElement = myArrayList.get (1);
        System.out.println (myElement);

        // adding elements at specific index
        myArrayList.add (3, 30);
        System.out.println (myArrayList);

        // changing element at specific index
        myArrayList.set(0, 50);
        System.out.println (myArrayList);

        // checking size of ArrayList
        int size = myArrayList.size();
        System.out.println (size);

        // deleting an element from specific index
        myArrayList.remove(1);
        System.out.println (myArrayList);

        // ascending order
        Collections.sort(myArrayList);
        System.out.println (myArrayList);

        // deleting complete array list
        myArrayList.clear();
        System.out.println (myArrayList);
    }
}
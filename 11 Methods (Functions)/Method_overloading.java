/*
Multiple methods could have same name as long as the number or type of parameters is dfferent
*/


public class Method_overloading {

    static int Add (int n1, int n2) {
        return n1+n2;
    }


    static int Add (int num1, int num2, int num3) {
        return num1+num2+num3;
    }


    static double Add (double n1, double n2) {
        return n1+n2;
    }


    public static void main (String[] args) {

        int result1 = Add (5, 6);
        System.out.println (result1);


        int result2 = Add(3, 4, 5);
        System.out.println (result2);


        double result3 = Add (4.5, 5.5);
        System.out.println (result3);

    }
}

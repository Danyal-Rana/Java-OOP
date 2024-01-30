public class Logical {
    public static void main (String [] args) {
        int a = 5;

        boolean result_1 = a>0 && a<10;
        boolean result_2 = a>0 || a<1;

        System.out.println (!result_1);
        System.out.println (result_2);
    }
}

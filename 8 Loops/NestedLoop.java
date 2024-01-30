public class NestedLoop {
    public static void main (String[] args) {

        for (int i=50 ; i < 200 ; i += 50) {
            System.out.println (i);
            System.out.print (" ");

            for (int j=i ; j <= i+50 ; j+=5 ) {
                System.out.println (j);
            }
        }
    }
}

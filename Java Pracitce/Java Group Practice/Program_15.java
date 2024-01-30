public class Program_15 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        if (a > b) {
            int c = a % b;
            System.out.println("Remainder when a is divided by b is: " + c);
        } else {
            int c = b % a;
            System.out.println("Remainder when b is divided by a is: " + c);
        }
    }
}

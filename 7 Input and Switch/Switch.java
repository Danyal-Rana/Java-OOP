public class Switch {
    public static void main (String[] args) {
        char day = 'm';

        switch (day) {
            case 'm':
                System.out.println ("Monday");
            case 't':
                System.out.println ("Tuesday");
                break;
            case 'w':
                System.out.println ("Wednesday");
            case 'T':
                System.out.println ("Thursday");
            case 'f':
                System.out.println ("Friday");
            case 's':
                System.out.println ("Satureday");
            case 'S':
                System.out.println ("Sunday");
            default:
                System.out.println ("Your entered the wrong command.");
        }
    }
}
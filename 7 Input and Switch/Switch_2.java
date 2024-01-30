public class Switch_2 {
    public static void main (String[] args) {
        char day = 'l';

        switch (day) {
            case 'm':
                System.out.println ("Monday");
                break;
            case 't':
                System.out.println ("Tuesday");
                break;
            case 'w':
                System.out.println ("Wednesday");
                break;
            case 'T':
                System.out.println ("Thursday");
                break;
            case 'f':
                System.out.println ("Friday");
                break;
            case 's':
                System.out.println ("Satureday");
                break;
            case 'S':
                System.out.println ("Sunday");
                break;
            default:
                System.out.println ("Your entered the wrong command.");
        }
    }
}
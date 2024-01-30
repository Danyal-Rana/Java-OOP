public class Arrays_2 {
    public static void main (String [] args) {

        int [] marks = {92, 94, 97, 98, 91};

        /*
        for (int i=0; i<marks.length; i++) {
            System.out.println (marks[i]);
        }
        */

        System.out.println (marks[0]);
        marks [0] = 8;
        System.out.println (marks[0]);
    }   
}

// variable = (condition) ? ExpressionTrue : ExpressionFasle

public class Ternary {
    public static void main(String[] args) {
        int time = 8;

        String status = time>18 || time < 6 ? "Good Day" : "Good Night";

        System.out.println (status);
    }
}
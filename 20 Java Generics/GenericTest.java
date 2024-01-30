public class GenericTest<T extends Number> {

    private T salary;
    private T expenses;

    public GenericTest(T salary, T expenses) {
        this.salary = salary;
        this.expenses = expenses;
    }

    public T calculateSavings() {
        Number result = salary.doubleValue() - expenses.doubleValue();
        return (T) result; // Safe cast now, as result is a Number
    }

    public static void main(String[] args) {
        // Test with Integers
        GenericTest<Integer> test1 = new GenericTest<>(25000, 18000);
        System.out.println("Savings with Integers: " + test1.calculateSavings());

        // Test with Doubles
        GenericTest<Double> test2 = new GenericTest<>(25000.50, 18000.25);
        System.out.println("Savings with Doubles: " + test2.calculateSavings());
    }
}
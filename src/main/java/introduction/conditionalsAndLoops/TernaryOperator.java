package introduction.conditionalsAndLoops;

public class TernaryOperator {
    public static void main(String[] args) {
        int b = 0;
        int a = 10;

        b = a > 7 ? 77 : 11;
        System.out.println(a);
        System.out.println(b);

        int max = a > b ? a : b;
        System.out.println("max: " + max);

    }
}

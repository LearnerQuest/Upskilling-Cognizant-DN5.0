public class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;
        int result3 = 100 / 5 + 2 * 3;

        System.out.println("10 + 5 * 2 = " + result1);
        System.out.println("Multiplication happens before addition.");

        System.out.println("(10 + 5) * 2 = " + result2);
        System.out.println("Parentheses have highest priority.");

        System.out.println("100 / 5 + 2 * 3 = " + result3);
        System.out.println("Division and multiplication happen before addition.");
    }
}

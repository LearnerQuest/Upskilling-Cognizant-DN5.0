import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        if (!sc.hasNextInt()) {
            System.out.println("Please enter a valid integer.");
            sc.close();
            return;
        }

        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }

        sc.close();
    }
}
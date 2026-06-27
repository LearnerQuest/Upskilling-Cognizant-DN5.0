import java.util.Scanner;

public class CustomExceptionTest {

    public static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18.");
        }

        System.out.println("Eligible.");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");

        int age = sc.nextInt();

        try {

            checkAge(age);

        } catch (InvalidAgeException e) {

            System.out.println(e.getMessage());

        }

        sc.close();

    }

}
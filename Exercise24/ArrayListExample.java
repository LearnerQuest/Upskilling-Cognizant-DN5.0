import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();

        System.out.print("Enter number of students: ");

        int n = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter name: ");

            students.add(sc.nextLine());

        }

        System.out.println("\nStudents:");

        for (String s : students) {

            System.out.println(s);

        }

        sc.close();

    }

}
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

record Person(String name, int age) {
}

public class PersonRecordExample {
    public static void main(String[] args) {
        Person p1 = new Person("Aashi", 21);
        Person p2 = new Person("Riya", 17);
        Person p3 = new Person("Ankit", 25);
        Person p4 = new Person("Neha", 16);

        System.out.println("Person Records:");
        System.out.println(p1);
        System.out.println(p2);

        List<Person> people = Arrays.asList(p1, p2, p3, p4);

        List<Person> adults = people.stream()
                .filter(person -> person.age() >= 18)
                .collect(Collectors.toList());

        System.out.println("\nPeople with age 18 or above:");
        for (Person person : adults) {
            System.out.println(person);
        }
    }
}
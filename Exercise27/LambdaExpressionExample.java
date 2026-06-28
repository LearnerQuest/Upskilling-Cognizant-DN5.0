import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Riya");
        names.add("Aashi");
        names.add("Neha");
        names.add("Ankit");
        names.add("Rahul");

        Collections.sort(names, (name1, name2) -> name1.compareTo(name2));

        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        String[] strings = {"Bhawesh", "harish", "Mayank", "Nikhil", "Harish", "Brajesh", "Vikas"};
        Set<String> allItems = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String item : strings) {
            if (!allItems.add(item)) {
                duplicates.add(item);
            }
        }

        System.out.println("Duplicate strings:");
        for (String duplicate : duplicates) {
            System.out.println(duplicate);
        }
    }
}
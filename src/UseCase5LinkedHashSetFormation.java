import java.util.*;

/**
 * Train Consist Management App
 * UC5: Preserve Insertion Order using LinkedHashSet
 *
 * Demonstrates:
 * - LinkedHashSet (ordered + unique)
 * - add()
 * - automatic duplicate removal
 */

public class UseCase5LinkedHashSetFormation {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        Set<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt duplicate
        train.add("Sleeper"); // will be ignored

        // Display final formation
        System.out.println("\nFinal Train Formation:");
        System.out.println(train);

        System.out.println("\nNote: Duplicate bogies are not allowed, and order is preserved.");

        System.out.println("\nSystem ready for further operations...");
    }
}
import java.util.*;

/**
 * Train Consist Management App
 * UC6: Map Bogie to Capacity using HashMap
 *
 * Demonstrates:
 * - HashMap
 * - Key-Value mapping
 * - put()
 * - entrySet() iteration
 */

public class UseCase6BogieCapacityMap {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashMap for bogie -> capacity
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Add bogie capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // Display capacities
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " seats");
        }

        System.out.println("\nSystem ready for further operations...");
    }
}
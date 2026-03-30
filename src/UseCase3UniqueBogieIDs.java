import java.util.*;

/**
 * Train Consist Management App
 * UC3: Track Unique Bogie IDs using HashSet
 *
 * Demonstrates:
 * - Set interface
 * - HashSet
 * - Automatic duplicate removal
 */

public class UseCase3UniqueBogieIDs {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs (with duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display result
        System.out.println("\nBogie IDs after insertion:");
        System.out.println(bogieIds);

        System.out.println("\nNote: Duplicate IDs are automatically removed.");

        System.out.println("\nSystem ready for further operations...");
    }
}
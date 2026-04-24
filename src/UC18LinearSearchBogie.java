import java.util.Arrays;

public class UC18LinearSearchBogie {

    // Linear Search Method
    public static boolean searchBogie(String[] bogieIds, String key) {

        for (int i = 0; i < bogieIds.length; i++) {

            // Compare using equals()
            if (bogieIds[i].equals(key)) {
                return true; // Found → stop early
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {

        // Test dataset
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        // Test Case 1: Found
        System.out.println("Search BG309: " + searchBogie(bogies, "BG309"));

        // Test Case 2: Not Found
        System.out.println("Search BG999: " + searchBogie(bogies, "BG999"));

        // Test Case 3: First Element
        System.out.println("Search BG101: " + searchBogie(bogies, "BG101"));

        // Test Case 4: Last Element
        System.out.println("Search BG550: " + searchBogie(bogies, "BG550"));

        // Test Case 5: Single Element Array
        String[] single = {"BG101"};
        System.out.println("Search BG101 (Single): " + searchBogie(single, "BG101"));
    }
}
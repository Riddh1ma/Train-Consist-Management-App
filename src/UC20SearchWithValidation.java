public class UC20SearchWithValidation {

    // Search method with validation
    public static boolean searchBogie(String[] bogieIds, String key) {

        // Fail-fast check
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available for search.");
        }

        // Linear Search (after validation)
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        // Test Case 1: Empty Array (Exception)
        try {
            String[] empty = {};
            System.out.println(searchBogie(empty, "BG101"));
        } catch (IllegalStateException e) {
            System.out.println("❌ Exception: " + e.getMessage());
        }

        // Test Case 2: Search Allowed
        String[] arr1 = {"BG101","BG205"};
        System.out.println("Search BG101: " + searchBogie(arr1, "BG101"));

        // Test Case 3: Found
        String[] arr2 = {"BG101","BG205","BG309"};
        System.out.println("Search BG205: " + searchBogie(arr2, "BG205"));

        // Test Case 4: Not Found
        System.out.println("Search BG999: " + searchBogie(arr2, "BG999"));

        // Test Case 5: Single Element
        String[] single = {"BG101"};
        System.out.println("Search BG101 (Single): " + searchBogie(single, "BG101"));
    }
}
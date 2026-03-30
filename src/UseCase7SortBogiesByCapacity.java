import java.util.*;

/**
 * Train Consist Management App
 * UC7: Sort Bogies by Capacity using Comparator
 */

class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display format
    @Override
    public String toString() {
        return name + " -> " + capacity + " seats";
    }
}

public class UseCase7SortBogiesByCapacity {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create List of Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("\nBefore Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Sort using Comparator (by capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting (by capacity):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nSystem ready for further operations...");
    }
}
import java.util.*;
import java.util.stream.Collectors;

/**
 * Train Consist Management App
 * UC8: Filter Passenger Bogies using Streams
 */

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " -> " + capacity + " seats";
    }
}

public class UseCase8StreamFiltering {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Original list (same as UC7)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("\nOriginal Bogies:");
        bogies.forEach(System.out::println);

        // Stream filtering (capacity > 60)
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (capacity > 60):");
        filteredBogies.forEach(System.out::println);

        System.out.println("\nSystem ready for further operations...");
    }
}
import java.util.*;
import java.util.stream.Collectors;

/**
 * Train Consist Management App
 * UC9: Group Bogies by Type using Collectors.groupingBy()
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
        return name + "(" + capacity + ")";
    }
}

public class UseCase9GroupBogies {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list with multiple bogies (including duplicates for grouping)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("AC Chair", 60));

        System.out.println("\nOriginal Bogies:");
        bogies.forEach(System.out::println);

        // Group by bogie name (type)
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        System.out.println("\nGrouped Bogies:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nSystem ready for further operations...");
    }
}
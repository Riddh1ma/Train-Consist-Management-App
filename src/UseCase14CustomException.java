import java.util.*;

/**
 * Train Consist Management App
 * UC14: Custom Exception for Invalid Capacity
 */

// Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie Class
class PassengerBogie {
    String name;
    int capacity;

    // Constructor with validation
    PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " -> " + capacity + " seats";
    }
}

public class UseCase14CustomException {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<PassengerBogie> bogies = new ArrayList<>();

        // Valid Bogie
        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            bogies.add(b1);
            System.out.println("\nAdded: " + b1);
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }

        // Invalid Bogie (Negative Capacity)
        try {
            PassengerBogie b2 = new PassengerBogie("AC Chair", -10);
            bogies.add(b2);
        } catch (InvalidCapacityException e) {
            System.out.println("\nError: " + e.getMessage());
        }

        // Invalid Bogie (Zero Capacity)
        try {
            PassengerBogie b3 = new PassengerBogie("First Class", 0);
            bogies.add(b3);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nFinal Bogie List:");
        bogies.forEach(System.out::println);

        System.out.println("\nSystem running safely...");
    }
}
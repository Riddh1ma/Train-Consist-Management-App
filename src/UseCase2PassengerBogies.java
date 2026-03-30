import java.util.*;

/**
 * Train Consist Management App
 * UC2: Add Passenger Bogies (ArrayList Operations)
 *
 * Demonstrates:
 * - add(), remove(), contains()
 * - CRUD operations
 */

public class UseCase2PassengerBogies {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nBogies after addition:");
        System.out.println(passengerBogies);

        // Remove a bogie
        passengerBogies.remove("AC Chair");

        System.out.println("\nBogies after removing AC Chair:");
        System.out.println(passengerBogies);

        // Check existence
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nDoes Sleeper exist? " + exists);

        // Final state
        System.out.println("\nFinal Bogie List:");
        System.out.println(passengerBogies);

        System.out.println("\nSystem ready for further operations...");
    }
}
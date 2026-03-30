import java.util.*;

/**
 * Train Consist Management App
 * UC4: Maintain Ordered Train Consist using LinkedList
 *
 * Demonstrates:
 * - LinkedList
 * - addFirst(), addLast(), add(index, element)
 * - removeFirst(), removeLast()
 * - Order preservation
 */

public class UseCase4TrainConsistLinkedList {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(train);

        // Insert Pantry Car at position 2
        train.add(2, "Pantry");

        System.out.println("\nAfter adding Pantry at position 2:");
        System.out.println(train);

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(train);

        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(train);

        System.out.println("\nSystem ready for further operations...");
    }
}
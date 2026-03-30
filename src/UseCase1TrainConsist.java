import java.util.*;

/**
 * Train Consist Management App
 * UC1: Initialize Train and Display Consist Summary
 *
 * Demonstrates:
 * - Class
 * - Main method
 * - ArrayList
 * - Console output
 */

public class UseCase1TrainConsist {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty train consist
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Train consist initialized.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // Program continues
        System.out.println("System ready for further operations...");
    }
}

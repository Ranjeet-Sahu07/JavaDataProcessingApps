package com.example.autoboxing;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * SumCalculator demonstrates Autoboxing and Unboxing in Java
 * 
 * Autoboxing: Automatic conversion of primitive types to their wrapper classes
 * Unboxing: Automatic conversion of wrapper classes to primitive types
 * 
 * @author Ranjeet-Sahu07
 */
public class SumCalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        System.out.println("=== Integer Sum Calculator with Autoboxing ===");
        System.out.println("Enter integers (type 'done' to finish):\n");
        
        // Accept multiple integer inputs
        while (true) {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine().trim();
            
            // Check if user wants to finish
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            
            try {
                // Convert String to int using Integer.parseInt()
                int number = Integer.parseInt(input);
                
                // Autoboxing: int is automatically converted to Integer
                numbers.add(number);
                System.out.println("Added: " + number);
                
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            }
        }
        
        // Calculate sum using enhanced for-loop
        if (numbers.isEmpty()) {
            System.out.println("\nNo numbers entered.");
        } else {
            int sum = 0;
            
            // Enhanced for-loop with Unboxing
            for (Integer num : numbers) {
                // Unboxing: Integer is automatically converted to int
                sum += num;
            }
            
            System.out.println("\n=== Results ===");
            System.out.println("Total numbers entered: " + numbers.size());
            System.out.println("Numbers: " + numbers);
            System.out.println("Sum of all numbers: " + sum);
            System.out.println("Average: " + (double)sum / numbers.size());
        }
        
        scanner.close();
        System.out.println("\nProgram completed successfully!");
    }
}

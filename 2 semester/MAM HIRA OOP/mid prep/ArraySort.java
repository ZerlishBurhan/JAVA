/*
ZERLISH BURHHAN 
221400111
OOP - LAB 
*/
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;


public class ArraySort {
    public static void main(String[] args) {
        try {
            File inputFile = new File("input.txt");
            Scanner scanner = new Scanner(inputFile);
            
            // Read array size from input file
            int size = scanner.nextInt();
            
            // Declare and initialize the array
            int[] array = new int[size];
            
            // Read array elements from input file
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
            
            // Print the original array
            System.out.println("Original Array:");
            printArray(array);
            
            // Sort the array if it's valid
            if (isValidArray(array)) {
                sortArray(array);
                System.out.println("Sorted Array:");
                printArray(array);
            } else {
                System.out.println("Array is not valid. Sorting skipped.");
            }
            
            // Write the sorted array to the output file
            File outputFile = new File("output.txt");
            PrintWriter writer = new PrintWriter(outputFile);
            
            writer.println("Original Array:");
            printArray(writer, array);
            
            if (isValidArray(array)) {
                sortArray(array);
                writer.println("Sorted Array:");
                printArray(writer, array);
            } else {
                writer.println("Array is not valid. Sorting skipped.");
            }
            
            writer.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
    
    // Method to sort the array
    static void sortArray(int[] array) {
        Arrays.sort(array);
        int count1 = 0;
        int count2 = 0;
        
        // Count the occurrences of 1 and 2
        for (int num : array) {
            if (num == 1) {
                count1++;
            } else if (num == 2) {
                count2++;
            }
        }
        
        int index = 0;
        
        // Move all 3's to the beginning of the array
        for (int i = 0; i < array.length - count1 - count2; i++) {
            array[index++] = 3;
        }
        
        // Move all 2's after the 3's
        for (int i = 0; i < count2; i++) {
            array[index++] = 2;
        }
        
        // Fill the remaining elements with 1's
        while (index < array.length) {
            array[index++] = 1;
        }
    }
    
    // Method to check if the array is valid
    static boolean isValidArray(int[] array) {
        for (int num : array) {
            if (num != 1 && num != 2 && num != 3) {
                return false;
            }
        }
        return true;
    }
    
    // Method to print the array to the console
    static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    // Method to print the array to a PrintWriter
    static void printArray(PrintWriter writer, int[] array) {
        for (int num : array) {
            writer.print(num + " ");
        }
        writer.println();
    }
}

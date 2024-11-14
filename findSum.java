/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SelectionSort;

import java.util.Scanner;

/**
 *
 * @author sanda
 */
public class findSum {
     public static void selectionSort(int[] arr) {
        int n = arr.length;

       
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

   
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.printf("%02d ", i); // To format single-digit numbers with a leading zero
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Create an array dynamically based on user input
        int[] arr = new int[n];

        // Input the elements of the array
        System.out.println("Enter " + n + " space-separated integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort the array using Selection Sort
        selectionSort(arr);

        // Calculate the sum of the array elements
        int sum = calculateSum(arr);

        // Output the sorted array
        System.out.println("Sorted Array:");
        printArray(arr);

        // Output the sum of the array elements
        System.out.println("Sum of values: " + sum);

        scanner.close();
    }
}

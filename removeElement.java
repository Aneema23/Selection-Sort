/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SelectionSort;

import java.util.Arrays;

/**
 *
 * @author sanda
 */
public class removeElement {
    public static int[] removeElement(int[] arr, int elementToRemove) {
        // Count occurrences of the element to remove
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToRemove) {
                count++;
            }
        }

        // If no element to remove, return the original array
        if (count == 0) {
            return arr;
        }

        // Create a new array with a smaller size
        int[] newArr = new int[arr.length - count];
        int index = 0;

        // Copy elements except the one to remove
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != elementToRemove) {
                newArr[index++] = arr[i];
            }
        }

        return newArr;
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // Define the array
        int[] arr = {3, 5, 4, 15, 9};

        // Element to remove
        int elementToRemove = 4;

        System.out.println("Original Array:");
        printArray(arr);

        // Remove the specified element
        int[] modifiedArr = removeElement(arr, elementToRemove);

        System.out.println("Array after removing element " + elementToRemove + ":");
        printArray(modifiedArr);
    }
}

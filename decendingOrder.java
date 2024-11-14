/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SelectionSort;

/**
 *
 * @author sanda
 */
public class decendingOrder {
    public static void selectionSortDescending(int[] arr) {
        int n = arr.length;

       
        for (int i = 0; i < n - 1; i++) {
            
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

         
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }

   
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 7, 1, 8};

        System.out.println("Original Array:");
        printArray(arr);

        selectionSortDescending(arr);

        System.out.println("Array Sorted in Descending Order:");
        printArray(arr);
    }
}

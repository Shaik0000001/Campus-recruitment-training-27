public class SelectionSort {
 
 public static void main(String[] args) {
 int[] arr = {20, 12, 10, 15, 2}; // Input array
 int n = arr.length; // Size of the array
 int temp; // Temporary variable for swapping
 int swapCount = 0; // Counter to track the number of swaps
 // Selection Sort Algorithm
 for (int i = 0; i < n - 1; i++) {
 int min = i; // Assume the current index is the minimum
 
 for (int j = i + 1; j < n; j++) {
 if (arr[j] < arr[min]) {
 min = j; // Update the index of the minimum element
 }
 }
 
 // Swap the found minimum element with the element at index i
 if (min != i) {
 temp = arr[i];
 arr[i] = arr[min];
 arr[min] = temp;
 swapCount++; // Increment the swap counter
 }
 }
 
 // Output the sorted array
 System.out.println("Sorted array in ascending order:");
 for (int i = 0; i < n; i++) {
 System.out.print(arr[i] + " ");
 }
 System.out.println("\nSwapcount: " + swapCount); // Print the number of swaps
 }
 
 }

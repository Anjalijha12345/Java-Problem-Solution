class GFG {
	
	// An optimized version of Bubble Sort
	static void bubbleSort(int arr[], int n) {
		int i, j, temp;
		boolean swapped;
		for (i = 0; i < n - 1; i++) {
			swapped = false;  // Initialize a flag to track whether any swaps were made in this pass.
			for (j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// If the current element is greater than the next element, swap them.
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;  // Set the flag to true, indicating that a swap has occurred.
				}
			}

			// If no two elements were swapped by the inner loop, then break out of the outer loop.
			if (swapped == false)
				break;
		}
	}

	// Function to print an array
	static void printArray(int arr[], int size) {
		int i;
		for (i = 0; i < size; i++)
			System.out.print(arr[i] + " ");  // Print each element of the array separated by space.
		System.out.println();  // Move to the next line for a clean output.
	}

	// Driver program
	public static void main(String args[]) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		int n = arr.length;
		bubbleSort(arr, n);  // Call the bubbleSort method to sort the array.
		System.out.println("Sorted array: ");
		printArray(arr, n);  // Print the sorted array.
	}
}

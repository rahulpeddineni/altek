package array;

public class Ascending_order_decending_order {


	    // Method to sort array in ascending order
	    public static void printAscending(int[] arr) {
	        int[] sorted = arr.clone(); // Clone original array to keep it unchanged
	        for (int i = 0; i < sorted.length - 1; i++) {
	            for (int j = i + 1; j < sorted.length; j++) {
	                if (sorted[i] > sorted[j]) {
	                    // Swap elements
	                    int temp = sorted[i];
	                    sorted[i] = sorted[j];
	                    sorted[j] = temp;
	                }
	            }
	        }
	        System.out.print("Ascending Order: ");
	        for (int num : sorted) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

	    // Method to sort array in descending order
	    public static void printDescending(int[] arr) {
	        int[] sorted = arr.clone(); // Clone original array
	        for (int i = 0; i < sorted.length - 1; i++) {
	            for (int j = i + 1; j < sorted.length; j++) {
	                if (sorted[i] < sorted[j]) {
	                    // Swap elements
	                    int temp = sorted[i];
	                    sorted[i] = sorted[j];
	                    sorted[j] = temp;
	                }
	            }
	        }
	        System.out.print("Descending Order: ");
	        for (int num : sorted) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        int[] numbers = {3,6,8,9,0,3,5,6,2};

	        // Print the original array
	        System.out.print("Original Array: ");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	        System.out.println();

	        // Call methods
	        printAscending(numbers);
	        printDescending(numbers);
	    }
	}


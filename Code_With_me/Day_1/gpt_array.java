import java.util.*; // Importing library for Scanner class (input from user)

class array {

    // Method to update array elements and a simple variable
    public static int update(int arr[], int run) {
        run = 10 + 10; // This changes only the local copy of 'run' (pass by value)

        // Loop through array and double each element
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2; // Arrays are passed by reference, so changes affect the original array
        }

        return 0; // Return value is not used in main
    }

    public static void main(String[] args) {
        int run = 20; // Original variable 'run'

        Scanner sc = new Scanner(System.in); // Scanner object for input

        int arr[] = new int[2]; // Declaration of array with 2 elements

        // Input values into the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of a[" + i + "]: "); // i is the index
            arr[i] = sc.nextInt(); // Assign input value to array
        }

        sc.close(); // Close scanner to prevent resource leak

        update(arr, run); // Call update method
        // Note: 'arr' changes because arrays are passed by reference
        // 'run' does NOT change in main because primitives are passed by value

        System.out.println("Value of run after update(): " + run); // Prints original 'run' (still 20)

        // Print array elements
        System.out.print("Array elements: [");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
            if (j < arr.length - 1) System.out.print(", "); // Add comma except for last element
        }
        System.out.println("]");

        // Print size of array
        System.out.println("Size of arr: " + arr.length); // Length of array
    }
}

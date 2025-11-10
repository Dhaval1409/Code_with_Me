import java.util.*; // Scanner class for input

class array {

    // Update array values
    public static int update(int arr[], int run) {
        run = 10 + 10; // run changed locally (pass by value)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2; // array changed (pass by reference)
        }
        return 0;
    }

    public static void main(String[] args) {
        int run = 20;
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[2]; // array of size 2

        // Input array values
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter the value of a[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        sc.close();

        update(arr, run); // array passed by reference, run by value

        System.out.println(run); // run is still 20

        // Print array
        System.out.print("[");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + ",");
        }
        System.out.println("]");

        System.out.println("size of arr: " + arr.length); // array length
    }
}

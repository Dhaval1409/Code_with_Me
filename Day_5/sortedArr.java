//QUETION : check given array is sorted or not 
class sortedArr {

    public static boolean OriginalSolution(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return OriginalSolution(arr, i + 1);
    }

    public static int Sorted(int arr[]) {   // quetion solve by me with  8:34 min 
        int n = 0;
        if (n == arr.length) {

            return 1;
        }
        int fnm1 = arr[n + 1];
        int fnm2 = arr[n + 2];
        if (fnm1 > fnm2) {
            System.out.println("array is  not sorted");
        }
        if (fnm2 > fnm1) {
            System.out.println("array is sorted");
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        // Sorted(arr);
        System.out.println(OriginalSolution(arr, 0));

    }
}

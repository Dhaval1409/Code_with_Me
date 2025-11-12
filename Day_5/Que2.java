public class Que2 {
    public static int First(int arr[],int key,int i){ // quetion solve by me with  5:03 min
       
        if(i==arr.length){
            System.out.println("value is not presnet");
            return -1;
        }
        if(key==arr[i]){
            System.out.println("value presengt at : " + arr[i] );
            return  arr[i];
        }
        return  First(arr, key , i+1);
    }

    public static int OriginalSolution(int arr[],int key,int i ){
        if(i==arr.length){
            return -1;
        }
        if(key==arr[i]){
            return  i;
        }
        return  OriginalSolution(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,74,5,2,1};
        First(arr,99,0);
        OriginalSolution(arr, 2, 0);
    }
}

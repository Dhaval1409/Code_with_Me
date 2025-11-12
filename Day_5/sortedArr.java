class sortedArr{
    public static int Sorted(int arr[]){
        int n = 0;
        if(n == arr.length){

            return  1 ;
        }
       int  fnm1 =arr[n+1];
       int fnm2 = arr[n+2];
       if(fnm1 > fnm2){
        System.out.println("array is  not sorted");
       }
       if(fnm2 > fnm1){
        System.out.println("array is sorted");
       }
        return  -1;

    }
    public static void main(String[] args) {
        int arr[]={10,20,1,40,50};
        Sorted(arr);
    }
} 

// quetion solve by me with  8:34 min 
class reverse{
    public static void main(String[] args) {
        int arr[]={1,2,3,5,12,21,19};
        int start = 0 ;
        int end = arr.length-1;
        while(start < end){
            int temp = arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
            
        }

        for(int j=0;j<arr.length;j++){
        System.out.print(" "+arr[j]);
        }
    }
}
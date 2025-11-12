public class Que3 {

    public static  int OriginalSolution(int arr[],int key ,int i){
        if(i==arr.length){
            return  -1;
        }
        int isFound = OriginalSolution(arr, key, i+1);
        if(isFound==-1 && arr[i]== key){
            return  i;
        }
        return isFound;  
    }
    public static int First(int arr[],int key,int i){
        if(i==0){
            return -1;
        }
        if(key == arr[i]){
            System.out.println("last occurence at :" + i);
            return  i ;
        }
        return First(arr, key, i-1);
    }
    public static void main(String[] args) {
        int arr[]={1,3,2,1,12,2,4,1};
        int n = arr.length-1;
     
        First(arr,1,n);
        System.out.println(OriginalSolution(arr, 1, 0));
       
    }
}

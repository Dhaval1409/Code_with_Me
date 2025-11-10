import  java.util.*;
class java{

    public  static  int Largest(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
        if(arr[i]>max){
            max = arr[i];
        }
        }
        
        return max;
    }
    public static int LinerSearch(int arr[],int target ){

        for(int i = 0 ;i<arr.length;i++){
            if(target==arr[i]){
            System.out.println("value :" + arr[i] + " found at index : " + i );
            }
        }

        return  0 ;
    }
    public static void main(String[] args) {
        int arr[]={10,12,3,4,11,32,2,1};
        Scanner sc = new Scanner(System.in);
        // System.out.print("enter the target value : ");
        sc.close();
        // int target = sc.nextInt();
        System.out.println(Largest(arr));
        // LinerSearch(arr,target);


        }
}
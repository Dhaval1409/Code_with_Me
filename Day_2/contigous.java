public class contigous {
    public static void main(String[] args) {
          int maxsum = Integer.MIN_VALUE;
          int minsum =Integer.MAX_VALUE;
        int arr[]={2,4,6,8,10};
        for(int i = 0 ;i<arr.length;i++){
              
            for(int j =i+1;j<arr.length;j++){
                int sum = 0 ;
        
                for(int k = i ;k<j+1;k++){
                sum+=arr[k];
               if(maxsum< sum){
                maxsum = sum;
               }
               if(minsum > sum ){
                minsum = sum;
               }
            
               System.out.print(arr[k]  );

                }
                System.out.print(" =" + sum);
                System.out.print(" ");
            }
          
            System.out.println();
        
        }
           System.out.println("max sum is = "+ maxsum);
            System.out.println("max sum is = "+ minsum);
    }
}

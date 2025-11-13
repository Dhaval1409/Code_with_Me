class Que1{

public static int OriginalSolution(int x,int n){
    if(n==0){
        return  1;
    }
    return  x  * OriginalSolution(x, n-1) ;
}

public static int OptimizeSolution(int x,int n){  // time complex O(logn)
 if(n==0){ 
    return 1;
 }
 int half = OptimizeSolution(x, n/2);
 half = half * half;
 if(n%2 != 0){
     half = half + x;
 }
 return half;

}


 public static int Power(int x,int n){ // solve within  4:10 sec 
    if(n==1){
        return  x;
    }
    int fnm1 = x * Power(x,n-1);
    return fnm1;

 }
    public static void main(String[] args) {
        int x = 2;
        int n =3;
        // System.out.println(  Power(x,n));
        // OriginalSolution(x, n);
        System.out.println(OptimizeSolution(x, n));
      

        }
}
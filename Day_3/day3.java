class day3{
    public static int nFibo(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1 = nFibo(n-1);
        int fnm2 = nFibo(n-2);
        int ans = fnm1 + fnm2 ;
return  ans;
    }
    public static int nSum(int n){
        if(n==1){
            return  1;

        }
        int fm1 = nSum(n-1);
        System.out.println("hello kitty");
        int fn=n+fm1;
    
        return  fn;
    }
    public static int  fact(int n){
        if(n==0){
            return 1; 
        }
        int fn1 = fact(n-1);
        int fn = n * fn1;
        return  fn;
        
    }
    public static void inc(int n){
        if(n ==0){
            return  ;
        }
        inc(n-1);
     System.out.println(n);


    }
    public static void nNum(int n ){
        if(n==1){
            System.out.println(n);
            return ;
        }
    System.out.println(n+ "");
    nNum(n-1);

    }
    public static void main(String[] args) {
        int n = 5;
    //   nNum(10);
    //   inc(n);
    // System.out.println(  fact(3));
    // System.out.println( nSum(n));
    System.out.println(  nFibo(26));
  
   
    
    }
}
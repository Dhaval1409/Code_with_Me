public class fibbo {
    public static int fibbo(int n){
        if(n==1 || n==0){
            return n ;
        }
        int fnm1 = fibbo(n-1);
        int fnm2 = fibbo(n-2);
        int fn = fnm1 + fnm2;
        
        return  fn;
    }
    public static void main(String[] args) {
        System.out.println( fibbo(25));
    
    }
}

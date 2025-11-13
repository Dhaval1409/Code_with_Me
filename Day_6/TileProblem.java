public class TileProblem {
    public static int Tiles(int n ){
        if(n==0 || n==1){
            return 1;
        }
        int vertical = Tiles(n-1);
        int horizontal = Tiles(n-2);

        int totalWays = vertical + horizontal ;
        
        return totalWays;
    }
    public static void main(String args[]){
        int  n = 4;
        
        System.out.println( Tiles(n));
       
    }
}



public class FriendPair {
    public static int PrintF(int n){   
        //base 
        if(n==1 || n==2){
            return  n;
        }
        //kam
        int fnm1 = PrintF(n-1);

        //couple
        int fnm2 = PrintF(n-2);
        int pairway = (n-1) * fnm2;

        //totole
        int totalway =  fnm1 + pairway;
    
        return totalway ;
    }
    public static void main(String[] args) {
        int n = 4 ;
        System.out.println(  PrintF(n));
      
    }
}

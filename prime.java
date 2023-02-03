public class prime{
    public static void main(String[] args){
        int n=100;
        for(int i=2;i<=n;i++){
            System.out.print( " " +i+" "+ isPrime(i));
        }
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}

public class fibbonacci {
    public static void main(String[] args){
        System.out.println(fibbo(7));
    }
    public static int fibbo(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibbo(n-1)+ fibbo(n-2);
    }
}

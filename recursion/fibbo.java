public class fibbo{
    public static void main(String[] args){
        System.out.println(fibb(8));
    }
    public static int fibb(int n){
        if(n==0||n==1){
            return n;
        }
        return fibb(n-1)+fibb(n-2);
    }
}
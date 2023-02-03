public class sumOfDigits{
    public static void main(String[] args){
        int n=5;
        System.out.println(func(n));
    }
    public static int func(int n){
        if(n==0){
            return 0;
        }
        return n + func(n-1);
    }

}
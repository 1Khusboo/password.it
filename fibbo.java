public class fibbo{
    public static void main(String[] args){
        fib(10);
    }
    public static void fib(int n){
        int a=0;
        int b=1;
        int i=0;
        while(i<n){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
            i+=1;
        }
    }

}
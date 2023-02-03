public class recursion1{
    public static void main(String[] args){
        print(20);
        System.out.println(" ");
        print2(20);
    }
    public static void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.print(n+" ");
        
    }

    public static void print2(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        print2(n-1);
    }
}